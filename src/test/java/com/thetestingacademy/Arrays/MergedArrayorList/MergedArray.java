package com.thetestingacademy.Arrays.MergedArrayorList;

import java.util.Arrays;

public class MergedArray {
        public static void main(String[] args) {
            int[] arr1 = {4, 2, 5, 1, 3};
            int[] arr2 = {6, 7, 10, 8, 9};
            //array length
            int len1=arr1.length;
            int len2=arr2.length;
            //new array merged
            int[] merged=new int[len1+len2];
            //copy first array to merged
            for(int i=0;i<len1;i++){
                merged[i]=arr1[i];
            }
            //copy second array to merged
            for(int i=0;i<len2;i++){
                merged[arr1.length+i]=arr2[i]; //merged[arr1.length+i]
            }
            //Arrays.toString--gives array value instead of index
            System.out.println(Arrays.toString(merged));
        }


}
