package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the array of numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int average=sum/n;
        System.out.println("sum:"+sum);
        System.out.println("average:"+average);
    }
}
