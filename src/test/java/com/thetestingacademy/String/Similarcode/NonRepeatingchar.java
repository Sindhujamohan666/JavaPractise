package com.thetestingacademy.String.Similarcode;

public class NonRepeatingchar {
    public static void main(String[] args) {
        String s="sophisticated";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch){
                    count++;
                }

            }
            if (count==1){//prints non repeating char
                System.out.print(ch);
                //System.out.println(ch);
            }
        }
      }
}