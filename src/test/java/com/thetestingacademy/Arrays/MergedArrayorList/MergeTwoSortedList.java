package com.thetestingacademy.Arrays.MergedArrayorList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
       Integer[] arr1={4,2,5,1,3};
       Integer[] arr2={6,7,10,8,9};
       //using List
       List<Integer> list1=new ArrayList<>(Arrays.asList(arr1));
       List<Integer> list2=new ArrayList<>(Arrays.asList(arr2));
       List<Integer> mergedlist=new ArrayList<>(list1);
       mergedlist.addAll(list2);

       Collections.sort(mergedlist);
        System.out.println(mergedlist);

    }
}
