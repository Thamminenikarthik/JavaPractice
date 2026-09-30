package Gut;
import java.util.Scanner;
import java.util.HashMap;
/*1. Given a string, find the first repeating character.
        Example:
Input:
str = "programming"
Output:
r*/
public class FirstRepeatingChar {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String intput = sc.next();
        HashMap<String,Integer>myMap = new HashMap<>();

        for(int i = 0;i<intput.length();i++){
            String temp = intput.charAt(i)+"";
            myMap.put(temp,myMap.getOrDefault(temp,0)+1);
        }
        for(int i = 0;i<intput.length();i++){
            String temp = intput.charAt(i)+"";
            if(myMap.get(temp) >1){
                System.out.println(temp);
                break;
            }
        }



    }
}
