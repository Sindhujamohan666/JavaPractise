package com.thetestingacademy.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListofString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple"));
        Collections.sort(list);
        System.out.println(list);
    }
}
