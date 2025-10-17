package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class ReverseNumberusingmath {
    public static void main(String[] args) {
        //same code as palindrome reversal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any int");
        int input = sc.nextInt();
        int rev=0;
        while(input!=0) {
            int digit = input % 10; //gets last digit
            rev= rev*10+digit;  //reversed
            input=input/10;  //remove last
        }
        System.out.println(rev);
    }
}
