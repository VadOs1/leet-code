package com.gmail.dissa.vadim.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        return nums.length != IntStream.of(nums).boxed().collect(Collectors.toSet()).size();
    }
}
