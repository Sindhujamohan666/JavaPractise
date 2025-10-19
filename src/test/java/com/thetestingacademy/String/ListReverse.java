package com.thetestingacademy.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        Integer[] arr={6,5,7,8,9};
        List<Integer> list=new ArrayList(Arrays.asList(arr));
        Collections.reverse(list);
        System.out.println(list);
    }
}
