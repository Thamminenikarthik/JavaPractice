package Gut;
import java.util.Scanner;

/*
1. Given a sentence, find the longest word.
Example:
Input:
str = "In Vcube, Java is simple"
Output:simple
Constraint:Ignore punctuation & Symbols
*/

public class LongestWordInSentence {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String Sentence :");

        String input = sc.nextLine();
        String output = "",tempOutput = "";


        for (int i =0;i<input.length();i++){
            char temp = input.charAt(i);
            if(temp>='a' && temp<= 'z' || temp >= 'A' && temp<= 'Z'){
                tempOutput += temp;
            }

           else if(temp != '\''){
               if(tempOutput.length() > output.length()){
                   output = tempOutput;
               }
                tempOutput = "";
            }

        }
        if(tempOutput.length() > output.length()){
            output = tempOutput;
            tempOutput = "";
        }
        System.out.println(output);
    }
}
