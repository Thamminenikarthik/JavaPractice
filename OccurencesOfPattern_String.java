package Gut;
import java.util.Scanner;
/*1. Find all occurrences of a pattern in a text.
        Example:
Input:
text = "AABAACAADAABAABA"
pattern = "AABA"
Output:
        [0,9,12]*/

/*
TC & SC of the written code
TC: O(N*K)
SC: O(K) -> auxilary space
*/
public class OccurencesOfPattern_String {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            String input = null,pattern = null;
            System.out.println("Enter the Stirng : ");
            input = sc.next();
            System.out.println("Enter the patter to Search : ");
            pattern = sc.next();
            int n = input.length();int PtrnLen = pattern.length();

            for(int i = 0;i<=n-PtrnLen;i++){
                if(input.charAt(i) == pattern.charAt(0)){
                    String val =  input.substring(i,i+PtrnLen);

                    if(val.equals(pattern)){
                        System.out.print(i + " ");
                    }

                }
            }
            

        }
    }
