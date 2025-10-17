package com.thetestingacademy.String.Palindrome;

public class PalindromeStrBuilder {
    public static void main(String[] args) {
        String str="madam";
        String revstr=new StringBuilder(str).reverse().toString();
        if(str.equals(revstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
