package com.thetestingacademy.Arrays.RemoveDuplicate;

import java.util.Arrays;

public class RemoveDuplicatessusingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,5,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){ //i=0
            if(i==0||(arr[i]!=arr[i-1])){  //i==0
                System.out.println(arr[i]+" ");
            }
        }

    }
}
