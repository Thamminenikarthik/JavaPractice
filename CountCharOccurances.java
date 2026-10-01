package Gut;

import java.util.Scanner;

/*2. Given a string and a character, count its occurrences.
Example:
Input:
str = "banana"
ch = 'a'
Output: 3
     */
public class CountCharOccurances {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str1 = sc.next();
        System.out.println("Enter the character to find in string :");
        String ch = sc.next().charAt(0)+"";

        int countOccurance = 0;
        for(int i = 0;i<str1.length();i++){
            if((str1.charAt(i)+"").equals(ch)){
                countOccurance++;
            }
        }
        System.out.println(countOccurance);

    }
}
