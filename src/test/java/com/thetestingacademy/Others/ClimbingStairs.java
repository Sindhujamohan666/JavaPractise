package com.thetestingacademy.Others;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=5; //no of steps
        if(n==1){
            System.out.println("Number of ways to climb " + n + "step is :"+ n);
        }
        if(n==2){
            System.out.println("Number of ways to climb " + n +" steps is :"+ n);
        }
        int first=1;
        int second=2;
        int result=0;
        for(int i=3;i<=n;i++){
            result=first+second;
            first=second;
            second=result;
        }
        System.out.println("Number of ways to climb "+n+"steps is:"+result);
    }
}
