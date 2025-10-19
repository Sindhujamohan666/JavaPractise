package com.thetestingacademy.String.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverseUsingList {
    public static void main(String[] args) {
        String[] s={"Malavika","Jovika","Poovika"};
        List<String> list=new ArrayList<>(Arrays.asList(s));
        Collections.reverse(list);
        System.out.println(list);

    }
}
