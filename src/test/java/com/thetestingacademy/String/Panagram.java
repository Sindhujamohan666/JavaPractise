package com.thetestingacademy.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    //if  a sentence contains A to Z atleast once it is  a panagram

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str1=str.toLowerCase();

        Set<Character> set=new HashSet<>();
        for(char ch :str1.toCharArray()){
            if(ch>='a'&&ch<='z'){ //Note to add >= and<=
                set.add(ch);
            }
        }
        //printing
        if(set.size()==26){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not a Panagram");
        }
    }
}
