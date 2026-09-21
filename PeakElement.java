package Gut;

import java.util.Scanner;

/*1. Find an element that is greater than its neighbors.
        Example:
Input:
arr = [1, 3, 20, 4, 1, 0]
Output:
        20

 */
/* code
     // TC = O(N)
     // SC = O(1)
*/
public class PeakElement {
    public  static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements into the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Greater Elements Are : ");

        if(arr.length == 1){
            System.out.println(arr[0]);
        }else{
            for(int i = 0;i< arr.length;i++){
                if(i-1 >= 0 && i+1 < arr.length){
                    // middle cases
                    if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                        System.out.print(arr[i] + " ");
                }
                else {
                    // edge cases
                    // i == 0 case
                    if(i+1 < arr.length && arr[i] > arr[i+1])
                        System.out.print(arr[i] + " ");

                    // i== arr.length
                    if(i-1 >=0 && arr[i] > arr[i-1])
                        System.out.print(arr[i] + " ");
                }
            }
        }

    }
}