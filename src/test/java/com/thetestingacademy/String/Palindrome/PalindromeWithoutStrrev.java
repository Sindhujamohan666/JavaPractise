package com.thetestingacademy.String.Palindrome;

import java.util.Scanner;

public class PalindromeWithoutStrrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String input=sc.nextLine();

        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
         if(input.equals(rev)){
             System.out.println("Palindrome");
         }
         else{
             System.out.println(" not Palindrome");
         }
    }

}
