package com.thetestingacademy.String;

public class StringUpperLowerToggle {
    public static void main(String[] args) {
        String s = "Hello World";
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println("togglecase:" +result);
    }
}
