package com.thetestingacademy.String;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str="000012234";
        String newstr=str.replaceAll("^0+(?!$)","");
        System.out.println(newstr);
    }

}
