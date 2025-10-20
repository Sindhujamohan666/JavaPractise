package com.thetestingacademy.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IteratingoverMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Banana",95);
        map.put("Apple",105);
        map.put("Pineapple",75);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
