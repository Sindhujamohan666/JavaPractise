package com.thetestingacademy.String.Diff;

public class LongestSubstringWithoutRepchar {
    public static void main(String[] args) {
        String str = "abcabcbb"; //declared string

        String longest="";
        String current="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(current.indexOf(c)!=-1){
                current=current.substring(current.indexOf(c)+1);
            }
            current+=c;
        }
        if(current.length()>longest.length()){
            longest=current;
        }
        System.out.println("The string is"+str);
        System.out.println("The longest string is"+longest);
        System.out.println("The length of the longest string is"+longest.length());
    }
}
