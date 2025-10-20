package com.thetestingacademy.List;

import java.util.*;

public class IntersectionOf2List {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,8,9,10));
        List<Integer> list2=new ArrayList<>(Arrays.asList(8,11,9,23,10,9));
        //converting to set to ignore duplicates
        Set<Integer> set1=new HashSet<>(list1);
        Set<Integer> set2=new HashSet<>(list2);  // Keep only elements that are also in list2
        set1.retainAll(set2); //set1 includes all elements that are in set2 and store in set1

        System.out.println("Intersection with no duplicates is"+set1);

    }
}
