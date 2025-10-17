package com.thetestingacademy.String.Similarcode;

public class WordOccurence {
    //Code -- find the number of occurance of word -"automate" in given string
   //e.g String s=”I will automate this automate code in my automate framework”
    public static void main(String[] args) {
        String str="I will automate this automate code in my automate framework";
        int count=0;
        String[] splittedstr=str.split(" ");
        for(String word:splittedstr){
            if(word.contains("automate")){
                count = count + 1;
            }
        }
        System.out.println(count);
    }

}
