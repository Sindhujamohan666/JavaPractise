package com.thetestingacademy.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedlist=new LinkedList<>(Arrays.asList("A","B","C","D","E"));

        //using iterator
        Iterator<String> iterator= linkedlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //using enhanced for loop
        for( String str:linkedlist){
            System.out.println(str);
        }

        //using for loop
        for(int i=0;i< linkedlist.size();i++){
            System.out.println(linkedlist.get(i));
        }

    }
}
