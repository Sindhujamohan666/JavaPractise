package com.thetestingacademy.Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n");
        int n = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        System.out.println("Enter the strings");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
       }

        //Remove duplicae using set
        Set<String> set=new HashSet<>();
        for (String num : arr){
            set.add(num);
        }
        List<String> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Without duplicates:"+list);
    }
}
