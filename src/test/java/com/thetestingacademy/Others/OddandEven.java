package com.thetestingacademy.Others;

public class OddandEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int even=0;
        int odd=0;
        for(int i=0;i<numbers.length;i++){
            if(i%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }

    }
}
