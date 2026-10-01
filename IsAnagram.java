package Gut;
import java.util.Scanner;
import java.util.HashMap;
/*1. Given two strings, determine whether they are anagrams.
        Example:
Input:
str1 = "listen"
str2 = "silent"
Output:
        true
Constraint:
Ignore character order*/
public class IsAnagram {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str1 = sc.next();
        System.out.println("Enter the second string :");
        String str2 = sc.next();

        boolean ans = isAnagram(str1,str2);
        System.out.println(ans);
    }

   static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length())
            return false;

        HashMap<String,Integer>map1 = new HashMap<>();
        HashMap<String,Integer>map2 = new HashMap<>();

        for(int i = 0;i<str1.length();i++){
            String temp1 = str1.charAt(i)+"";
            String temp2 = str2.charAt(i)+"";
            map1.put(temp1,map1.getOrDefault(temp1,0)+1);
            map2.put(temp2,map2.getOrDefault(temp2,0)+1);
        }
        for(int i = 0;i<str1.length();i++){
            String temp1 = str1.charAt(i)+"";
            String temp2 = str2.charAt(i)+"";
            if(map1.get(temp1) != map2.get(temp2)){
                return false;
            }
        }

        return true;
    }
}
