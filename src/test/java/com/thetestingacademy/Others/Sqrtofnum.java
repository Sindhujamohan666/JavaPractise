package com.thetestingacademy.Others;

public class Sqrtofnum {
    /*Problem Statement:
      Compute and return the square root of x, where x is a non-negative integer.*/

    public static void main(String[] args) {
        int n=9;
        int result= (int) Math.sqrt(n); //cast to int as it is double
        System.out.println("Square root of "+n + " is"+result);
    }
}
