package com.thetestingacademy;

import java.util.Arrays;
    //998+1=999{9,9,9}   999+1=1000{1,0,0,0}
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 8};
        for (int i= arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                System.out.println("Result:"+Arrays.toString(arr));
                return; //return is important else it wont print

            }
            arr[i]=0;// set to 0 and carry 1
        }
        int[] newarray=new int[arr.length+1];
        newarray[0]=1; // set to 0 and carry 1
        System.out.println("Result"+Arrays.toString(newarray));
    }
}
//Use return: stops the whole program after printing the result → correct behavior.

//Use break: only stops the loop → the “all 9s” code runs unnecessarily.