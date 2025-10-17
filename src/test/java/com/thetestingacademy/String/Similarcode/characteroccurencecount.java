package com.thetestingacademy.String.Similarcode;

public class characteroccurencecount {
    //success s-->3 c-->2 e-->1
    public static void main(String[] args) {
        String word="success";
        //Looping through string
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            // Count occurrences
            int count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==ch){
                    count++;
                }
            }
            //Print results
            if(word.indexOf(ch)==i){
                System.out.println(ch+"-->"+count + " times");
            }
        }

    }
}
