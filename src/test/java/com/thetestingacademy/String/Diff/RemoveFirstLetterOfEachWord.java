package com.thetestingacademy.String.Diff;

import java.sql.SQLOutput;

public class RemoveFirstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "Hello World From Java";
        String[] splittedstr=str.split(" ");

        String removedstr="";
        String firststr="";
        for(String word:splittedstr){
            if(word.length()>0) {
                firststr += word.charAt(0);
            }
            //substring(1)-->prints from index1
            if(word.length()>1){
                removedstr+=word.substring(1)+ " ";//concatenating space
            }
            else{
                removedstr+="";
            }
        }
        removedstr = removedstr.trim();
        System.out.println("The string is: "+str);
        System.out.println("The removed string is : "+removedstr);
        System.out.println("The first letter of string is: "+firststr);
    }
}
