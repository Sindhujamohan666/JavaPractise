package com.thetestingacademy.String.Palindrome;

public class Reversewords {
    public static void main(String[] args) {
            String s = "i.like.this.program.very.much";
            String[] split=s.split("\\.");//it is an escape char so \\. not only "."
            String rev=" ";
            for(int i=split.length-1;i>=0;i--){
                rev=rev+split[i];
                if(i!=0)
                    rev=rev+".";
            }
        System.out.println(rev);
        }
    }

