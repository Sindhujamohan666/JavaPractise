package com.thetestingacademy.Arrays;



import java.util.*;

public class Maxandmindiffbet2Elements {
    public static void main(String[] args) {
        Integer[] arr={9,8,7,6};//declare this as wrapper and not int to use in List
        List<Integer> list=Arrays.asList(arr);
         int max= Collections.max(list);
         int min=Collections.min(list);
         int maxdiff=max-min;
         System.out.println("Max diff is"+maxdiff);

         //Sort list and get smallest diff bet 2 conecutive elements
        Collections.sort(list);
        int mindiff=Integer.MAX_VALUE;
        for (int i=1;i<list.size();i++){ //i=0 will give error as there is no prev element
            int diff=list.get(i)-list.get(i-1);
            if(diff<mindiff){
                mindiff=diff;
            }
        }
        System.out.println("Min difference is "+mindiff);
    }
}
