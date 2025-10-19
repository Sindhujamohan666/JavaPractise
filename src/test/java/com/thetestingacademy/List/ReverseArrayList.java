package com.thetestingacademy.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};//making it wrapper to use in list
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);
        System.out.println("Reversed list is " +list);
    }
}
