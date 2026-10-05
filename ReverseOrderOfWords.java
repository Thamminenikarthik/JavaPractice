package Gut;
import java.util.Scanner;
/*2. Given a sentence, reverse the order of words.
        Example:
Input:
str = "Java Full Stack"
Output:
Stack Full Java
Constraint:
Remove extra spaces*/
public class ReverseOrderOfWords {
public static void main() {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter a sentence :");
    String input = sc.nextLine();
    boolean gotSpace = false;
    String output = "";
    String temp = "";

    for(int i = 0;i<input.length();i++){
        char currChar = input.charAt(i);
        if(currChar == ' ' && gotSpace){
            continue;
        }else if(currChar == ' '){
            gotSpace = true;
        }
        if((currChar >= 'A' && currChar <= 'Z' || currChar >= 'a' && currChar <= 'z') || currChar == '\'' ){
            temp += currChar;
            gotSpace = false;
        } else if (gotSpace) {
            output = temp + " " + output;
            temp = "";

        }
    }
    output = temp + " " + output;
    System.out.println(output);
}
}
