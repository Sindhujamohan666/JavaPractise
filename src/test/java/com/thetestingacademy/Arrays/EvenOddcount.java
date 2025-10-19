package com.thetestingacademy.Arrays;

public class EvenOddcount {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int evencount=0;
        int oddcount=0;
        for(int num:arr){
            if(num%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
