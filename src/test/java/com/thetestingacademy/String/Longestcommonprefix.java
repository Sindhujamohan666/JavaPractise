package com.thetestingacademy.String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Longestcommonprefix {
    public static void main(String[] args) {
       String[] arr={"flower","flow","flight"};
       //Remove duplicates with set
        Set<String> set=new LinkedHashSet<>(Arrays.asList(arr)); //LinkedHashSet--maintains order
        String[] uniquearray=set.toArray(new String[0]);

       String first=uniquearray[0];
       String last=uniquearray[uniquearray.length-1];
       int i=0;
       while(i<first.length()&&i<last.length()&&first.charAt(i)==last.charAt(i)){
           i++;
        }
        System.out.println("Longest common prefix:"+first.substring(0,i));

    }
}

