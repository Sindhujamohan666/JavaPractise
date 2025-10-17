package com.thetestingacademy.String;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FrizzBuzz {
    /*Given an integer n, for every positive integer i <= n, the task is to print,
    "FizzBuzz" if i is divisible by 3 and 5, "Fizz" if i is divisible by 3,
    "Buzz" if i is divisible by 5 "i" as a string, if none of the conditions are true.
     */
    /*Input: n = 3
    Output: ["1", "2", "Fizz"]*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter he value of n");
        int n=sc.nextInt();

        List<String> set=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){  //First 3 then 5(i%5==0&&i%3==0 ) will not work
                set.add("FizzBuzz");
            }
            else if(i%3==0){
                set.add("Fizz");
            }
            else if(i%5==0){
                set.add("Buzz");
            }
            else{
                set.add(String.valueOf(i));
            }

        }

        System.out.print(set);
    }
}
