package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static com.gmail.dissa.vadim.array.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    @Test
    void testTwoSum() {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}
