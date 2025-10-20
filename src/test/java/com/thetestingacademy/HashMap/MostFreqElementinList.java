package com.thetestingacademy.HashMap;



import java.util.*;

public class MostFreqElementinList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 3, 4, 3, 2, 2, 2);

        Map<Integer,Integer> freqmap=new HashMap<>();
        for(int num:list){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }

        int mostfreq=list.get(0);
        int maxCount=0;
        for(Map.Entry<Integer,Integer> entry: freqmap.entrySet()){
            if(entry.getValue()>maxCount){
                mostfreq=entry.getKey();
                maxCount= entry.getValue();
            }
        }
        System.out.println("Most frequent element is"+mostfreq);
    }
}
