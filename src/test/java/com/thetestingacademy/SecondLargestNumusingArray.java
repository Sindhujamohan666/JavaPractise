package com.thetestingacademy;

import java.util.Arrays;

public class SecondLargestNumusingArray {
    public static void main(String[] args) {
        int[] arr={6,5,7,3,8,4,9};
        Arrays.sort(arr);
        //arr[arr.length-2] where [arr.length-2] is index
        System.out.println("2nd largest number:"+arr[arr.length-2]);
        System.out.println("2nd smallest number:"+arr[1]);
    }

}
