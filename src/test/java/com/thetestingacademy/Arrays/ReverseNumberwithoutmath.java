package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class ReverseNumberwithoutmath {
    public static void main(String[] args) {
        //same code as palindrome reversal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String input=sc.nextLine();

        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println("reversed :" +rev);
    }
}
