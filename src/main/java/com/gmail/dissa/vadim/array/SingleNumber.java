package com.gmail.dissa.vadim.array;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce((n1, n2) -> n1 ^ n2)
                .orElseThrow(() -> new IllegalArgumentException("Illegal Argument"));
    }
}
