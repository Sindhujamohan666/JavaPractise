package com.thetestingacademy.Arrays;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int n=sc.nextInt();

        System.out.println("Enter the "+n+ "numbers");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("max number:" +max);
        System.out.println("min number:" +min);

    }

}
