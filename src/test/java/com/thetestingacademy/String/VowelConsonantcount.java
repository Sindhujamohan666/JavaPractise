package com.thetestingacademy.String;

public class VowelConsonantcount {
    public static void main(String[] args) {
        String str="sophisticated";
        int vowelcount = 0;
        int constcount = 0;
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
                System.out.println(ch+"-->vowel");
            } else {
                constcount++;
                System.out.println(ch+"-->consonant");
            }
        }
        System.out.println("vowelcount-->"+vowelcount);
        System.out.println("constcount-->"+constcount);
    }
}
