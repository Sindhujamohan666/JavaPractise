package com.thetestingacademy.HashMap;

import java.util.HashMap;
import java.util.Map;

    public class TwoSumMap {
        public static void main(String[] args) {
            // Step 1: Initialize the input array and the target sum
            int[] nums = {2, 7, 11, 15};   // Array of numbers
            int target = 13;

            // Step 2: Create a HashMap to store numbers and their indices
            // The key will be the number, and the value will be its index in the array
            Map<Integer,Integer> map=new HashMap<>();
            // Step 3: Loop through each number in the array
            for(int i=0;i< nums.length;i++){
                // Step 4: Calculate the complement (the number needed to reach the target)
                int complement=target-nums[i];
                // Step 5: Check if the complement is already in the map
                // If yes, that means we found the two numbers that add up to the target
                if(map.containsKey(complement)){
                    // Step 6: Print the result (indices of the two numbers)
                    System.out.println("Indices:["+map.get(complement)+"," + i+ "]");
                    System.out.println("Value:["+complement+","+nums[i]+"]");
                    // Step 7: Exit the loop once we find the answer
                    break;
                }
                // Step 8: Otherwise, store the current number and its index in the map
                map.put(nums[i],i);
            }

        }

    }

