package Gut;

import java.util.Scanner;

/*
Example:
Input:
arr = [1, 2, 2, 3, 1, 4, 2]
Output:
        1 -> 2
        2 -> 3
        3 -> 1
        4 -> 1
 */
/* code
     // TC = O(N^2)
     // SC = O(N)
*/
public class Frequency {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int outputArr[] = new int[n];

        System.out.println("Enter " + n + " elements into the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    outputArr[i]++;
                }
                if (i != j && arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i] + "->" + outputArr[i]);
            }
        }

    }
}
