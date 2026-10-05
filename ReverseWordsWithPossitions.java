package Gut;
import java.util.Scanner;

/*1. Given a sentence, reverse every word while keeping word positions unchanged.
Example:
Input:
str = "Java Full Stack"
Output:
avaJ lluF kcatS
Constraint:
Preserve spaces*/
public class ReverseWordsWithPossitions {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String input = sc.nextLine();
        String output = "";
        String temp = "";boolean gotSpace = false;

        for(int i = input.length()-1;i>=0;i--){
            char currChar = input.charAt(i);

            if(currChar == ' ' && gotSpace){
                continue;
            }
            if(currChar == ' '){
                gotSpace = true;
            }

            if((currChar >= 'A' && currChar <= 'Z') || (currChar >= 'a' && currChar <= 'z') || currChar =='\''){
                temp += currChar;
                if(gotSpace){
                    gotSpace = false;
                }

            } else if (gotSpace) {
                output = temp + " " + output;
                temp = "";

            }
        }
        output = temp + " " + output;
        System.out.println(output);

    }
}
