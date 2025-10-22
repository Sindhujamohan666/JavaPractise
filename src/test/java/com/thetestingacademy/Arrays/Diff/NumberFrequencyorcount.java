package com.thetestingacademy.Arrays.Diff;

import java.util.Map;
import java.util.HashMap;

public class NumberFrequencyorcount {
    //This code also present in map to find most frequent element.
    public static void main(String[] args) {
int[] arr = {1, 2, 2, 3, 1, 2, 4, 1};

    // 1. Count frequency of each element
    Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Print frequency of each element
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
    }

    // 2. Find the most frequent element(s)
    int maxFreq = 0;
        for (int freq : freqMap.values()) {
        if (freq > maxFreq) {
            maxFreq = freq;
        }
    }

        System.out.println("\nMost frequent element(s):");
        for (
    Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        if (entry.getValue() == maxFreq) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
}
