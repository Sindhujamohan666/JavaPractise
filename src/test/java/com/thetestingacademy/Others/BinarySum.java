package com.thetestingacademy.Others;

public class BinarySum {
    /*Problem Statement:
    Given two binary strings, return their sum (also a binary string).*/
    public static void main(String[] args) {
       String a="1010";
       String b="1111";
        int num1=Integer.parseInt(a,2); //base 2 means binary
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        System.out.println(result);
    }
}
