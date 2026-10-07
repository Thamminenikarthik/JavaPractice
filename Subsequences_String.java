package Gut;
import java.util.Scanner;
import java.util.ArrayList;
/*
1. Generate all subsequences of a string.
Example:
Input:
ABC
Output:"",A,B,C,AB,AC,BC,ABC
*/

public class Subsequences_String {
    static ArrayList<String>outputList = new ArrayList<>();
    public static void Subsequence(String input,String temp,int index){
        // base
        if(index == input.length()){
            outputList.add(temp);
            return;
        }
        // include
        Subsequence(input,temp+input.charAt(index),index+1);
        // exclude
        Subsequence(input,temp,index+1);
    }

    public static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the string : ");
        String input = sc.next();
        String temp = "";
        int index = 0;
        Subsequence(input,temp,index);
        System.out.println(outputList);
    }
}
