package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class NumberExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();


        System.out.println("Enter any number to search");
        int num = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array of numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==num){
                System.out.println(arr[i]+"-->Number exist");
            }

        }

    }
}