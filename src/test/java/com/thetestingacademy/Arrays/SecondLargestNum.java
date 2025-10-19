package com.thetestingacademy.Arrays;

import java.util.*;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n");
        int n = sc.nextInt();


        System.out.println("Enter the numbers");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Object> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        List<Object> list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
         if(list.size()<2){
             System.out.println("There is no second largest number");
         }else{
             System.out.println("Second largest number is"+list.get(1));//index 1 gets 2nd number
             System.out.println("Second smallest number is"+list.get(list.size()-2));
         }


    }
}