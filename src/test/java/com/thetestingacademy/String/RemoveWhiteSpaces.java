package com.thetestingacademy.String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str=" Geeks for Geeks ";
        str=str.replaceAll("\\s","");
        System.out.println("String without spaces:"+str);
    }

}
