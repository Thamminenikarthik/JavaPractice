package Gut;
import java.util.Scanner;
/*1. Given an array of integers, move all negative numbers to the beginning of the array.
Example:
Input:
arr = [1, -2, 3, -4, 5, -6]
Output:
        [-2, -4, -6, 1, 3, 5]
Constraint:
Time Complexity: O(n)*/
public class MoveNegativesToFront {
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

        int start = 0,last = arr.length-1;
        for(int i = 0;i<n;i++){
            if(arr[i] >=0){
                outputArr[last--] = arr[i];
            }else{
                outputArr[start++] = arr[i];
            }
        }
        for(int val : outputArr){
            System.out.print(val + " ");
        }
    }
}
