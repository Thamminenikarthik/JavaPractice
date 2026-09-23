package Gut;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*1. Given an array containing n+1 integers where each integer is between 1 and n, find the duplicate number.
        Example:
Input:
arr = [1, 3, 4, 2, 2]
Output:
        2
Constraint:
Do not modify the array
Time Complexity: O(n)
*/
public class PrintDuplicatesInUnsorted {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements into the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer>myset = new HashSet<>();
         for(int i = 0;i<n;i++){
             if(myset.contains(arr[i])){
                 System.out.println(arr[i]);
                 break;
             }else{
                 myset.add(arr[i]);
             }
         }

    }
}
