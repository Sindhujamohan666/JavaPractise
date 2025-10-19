package com.thetestingacademy.String.Patterns;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            //printing space
            for(int j=1;j<=rows-i;j++){ //rows-i
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
