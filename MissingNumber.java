package Gut;
import java.util.Scanner;
/*1. Given an array containing numbers from 1 to n with one number missing, find the missing number.
        Example:
Input:
arr = [1, 2, 3, 5]
Output:
        4
Constraint:
Time Complexity: O(n)*/
public class MissingNumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+ n +" elements into the array :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

       int range = n+1,orgSum = 0;
        for(int i = 1;i<=range;i++){
            orgSum += i;
        }

        int actualSum = 0;
        for(int i = 0;i<n;i++){
            actualSum += arr[i];
        }

        System.out.println("The missing element is : " + (orgSum - actualSum));

    }
}
