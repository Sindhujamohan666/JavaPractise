package com.thetestingacademy.Arrays.Diff;

public class strStr {
    //Implement strStr() which locates a substring within a given string.
    public static void main(String[] args) {
        String mainstring = "Hello World";
        String substring = "World";
        if(substring.isEmpty()){
            System.out.println("Substring is empty");
        }
        int index=mainstring.indexOf(substring);
        String substr=mainstring.substring(index,index+substring.length());
        if(index!=-1){
            System.out.println("substring found at index: "+index);
            System.out.println("Substring is "+substr);
        }
        else{
            System.out.println("Substring not found");
        }
    }
}
//practise this by implementing this as a method strStr
