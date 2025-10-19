package com.thetestingacademy.String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1");
        String str1=sc.nextLine();
        System.out.println("Enter string2");
        String str2=sc.nextLine();

        //cnverting strings to charArray
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        //sort array
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }

    public static class LongestcommonPrefix {
        //Find the longest common prefix in an array of strings.
        public static void main(String[] args) {

        }
    }
}
