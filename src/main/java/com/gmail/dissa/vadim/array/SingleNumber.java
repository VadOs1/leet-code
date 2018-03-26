package com.gmail.dissa.vadim.array;

import java.util.Arrays;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce((n1, n2) -> n1 ^ n2)
                .orElseThrow(() -> new IllegalArgumentException("Illegal Argument"));
    }
}
