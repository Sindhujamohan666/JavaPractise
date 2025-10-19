package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class ReverseNumberusingmath {
    public static void main(String[] args) {
        //same code as palindrome reversal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any int");
        int input = sc.nextInt();
        int rev=0;
        int temp = input;  // ✅ Keep a copy of the original number for palindrome cond
        while(temp!=0) {
            int digit = temp % 10; //gets last digit
            rev= rev*10+digit;  //reversed
            temp=temp/10;  //remove last
        }
        System.out.println(rev);
        if(input==rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");


    }
}
