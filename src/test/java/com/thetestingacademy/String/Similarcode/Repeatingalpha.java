package com.thetestingacademy.String.Similarcode;

public class Repeatingalpha {
    /*success-->count the no of repeatiing character
    s → 3
    c → 2
    Total repeating characters: 2  (because ‘s’ and ‘c’ repeat)*/
    public static void main(String[] args) {
        String word="success";

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==ch) {
                    count += 1;
                }
            }
            //word.indexOf(ch) == i(avoiding printing s-->3 multiple times)
            if(count>1&&word.indexOf(ch) == i){
                System.out.println(ch+"-->"+count +"times");
            }
        }

    }
}
