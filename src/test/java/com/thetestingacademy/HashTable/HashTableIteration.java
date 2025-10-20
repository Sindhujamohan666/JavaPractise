package com.thetestingacademy.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableIteration {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("apple",3);
        table.put("Orange",5);
        table.put("Avocado",9);

        //entryset-->iterating through key value pair
        for(Map.Entry<String,Integer> entry:table.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Enumeration

        Enumeration<String> keys=table.keys();
        while(keys.hasMoreElements()){
            String key=keys.nextElement();
            System.out.println("Key: "+key+" value:"+table.get(key));
        }

    }
}
