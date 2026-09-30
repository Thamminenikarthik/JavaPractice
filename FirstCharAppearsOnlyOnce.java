package Gut;
import java.util.HashMap;
import java.util.Scanner;

/*1. Given a string, find the first character that appears only once.
Example:
Input:
str = "VcubeJava"
Output:V
*/
public class FirstCharAppearsOnlyOnce {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String input = sc.next();
        HashMap<String,Integer>myMap= new HashMap<>();
        for(int i = 0;i<input.length();i++){
            String temp = input.charAt(i)+"";
            myMap.put(temp,myMap.getOrDefault(temp,0)+1);
        }

        for(int i = 0;i<input.length();i++){
            String temp = input.charAt(i)+"";
            int val = myMap.get(temp);

            if( val == 1 ){
                System.out.println(temp);
                break;
            }
        }
    }
}
