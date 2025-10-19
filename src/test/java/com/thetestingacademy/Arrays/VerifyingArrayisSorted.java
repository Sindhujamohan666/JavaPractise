package com.thetestingacademy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VerifyingArrayisSorted {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,9,7};
         List<Integer> list=new ArrayList<>(Arrays.asList(arr));
         System.out.println(list);
         boolean issorted=true;
         for(int i=0;i<list.size()-1;i++){
             if(list.get(i)>list.get(i+1)){
                 issorted=false;
                 break;
             }
         }
         if(issorted)
             System.out.println("Sorted");
         else
             System.out.println("Not sorted");
    }
}