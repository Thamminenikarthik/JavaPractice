package Gut;

import java.util.Scanner;

/*1. Given a string, remove duplicate characters while maintaining order.
Example:
Input:
str = "programming"
Output:
progamin*/
public class RemoveDuplicates_String {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String :");
        String str1 = sc.next(); String str2="";

        for(int i = 0;i<str1.length();i++){

            if(str2.contains(str1.charAt(i)+"") == false){
                System.out.print(str1.charAt(i) + " ");
                str2+=str1.charAt(i);
            }

        }


    }
}
