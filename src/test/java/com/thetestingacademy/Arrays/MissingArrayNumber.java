package com.thetestingacademy.Arrays;

public class MissingArrayNumber {
    public static void main(String[] args) {
        int[] str={8,2,3,4,5,7,1,9,10};
        int n=str.length+1; //inclucing a num
        int expectedsum=n*(n+1)/2;//n+1 is imp
        int actualsum=0;
        int missingnum;
        for(int num:str){
            actualsum+=num;
        }
         missingnum=expectedsum-actualsum;
         System.out.println(missingnum);
    }

}
