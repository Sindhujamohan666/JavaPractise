package com.thetestingacademy.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum=nums[0]; //index1
        for(int i=0;i<nums.length-1;i++){
            int currentsum=0;
            for(int j=i;j<nums.length-1;j++){
                currentsum+=nums[j];
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println(maxsum);
    }
}
