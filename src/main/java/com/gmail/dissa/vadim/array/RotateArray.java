package com.gmail.dissa.vadim.array;

/**
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note: Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
        }

        for (int i = 0; i < k; i++) {
            int lastValue = nums[nums.length - 1];
            for (int p = 0; p < nums.length; p++) {
                int nextValue = nums[p];
                nums[p] = lastValue;
                lastValue = nextValue;
            }
        }
    }
}
