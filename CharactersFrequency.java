package Gut;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*1. Given a string, find the frequency of every character.
Example:
Input:
str = "banana"
Output:
b = 1
a = 3
n = 2*/
public class CharactersFrequency {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String :");
        String str1 = sc.next();
        HashMap<Character,Integer>myMap = new HashMap<>();
        for(int i = 0;i<str1.length();i++){
            myMap.put(str1.charAt(i),myMap.getOrDefault(str1.charAt(i),0)+1);

        }
        for(Map.Entry<Character,Integer>entry:myMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
