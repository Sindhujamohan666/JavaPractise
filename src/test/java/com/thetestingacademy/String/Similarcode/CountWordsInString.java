package com.thetestingacademy.String.Similarcode;

public class CountWordsInString {
    public static void main(String[] args) {
        String str="Hello world! Welcome to Java.";
        String[] splittedstring=str.split(" ");
        //Length is not a function in array
        System.out.println(splittedstring.length);
    }
}
