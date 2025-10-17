package com.thetestingacademy.String;

public class AllSubstrings {
    public static void main(String[] args) {
        String s="madam";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){ //Note:j<=
                System.out.println(s.substring(i,j));
            }
        }
    }
}
