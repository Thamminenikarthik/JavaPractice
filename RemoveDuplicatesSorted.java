package Gut;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*1. Given a sorted array, remove duplicates and return the new length.
        Example:
Input:
arr = [1, 1, 2, 2, 3, 4, 4]
Output:
        [1, 2, 3, 4]
Length = 4
Constraint:
Use Two Pointer Approach
Time Complexity: O(n)*/
public class RemoveDuplicatesSorted {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Set<Integer>mySet = new HashSet<>();
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n +" elements into the array :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

       for(int val : arr){
           mySet.add(val);
       }

        System.out.println(mySet);
        System.out.println("The Updated Length is " + mySet.size());
    }
}
