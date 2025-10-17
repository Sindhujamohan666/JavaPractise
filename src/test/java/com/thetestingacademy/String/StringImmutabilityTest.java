package com.thetestingacademy.String;

public class StringImmutabilityTest {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World");
        System.out.println(str);//prints Hello
    }
}
