package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusOneTest {
    @Test
    void testDuplicatesRemoval() {
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(PlusOne.plusOne(new int[]{0})));
        assertEquals(Arrays.toString(new int[]{1, 2, 4}), Arrays.toString(PlusOne.plusOne(new int[]{1, 2, 3})));
        assertEquals(Arrays.toString(new int[]{4, 3, 2, 2}), Arrays.toString(PlusOne.plusOne(new int[]{4, 3, 2, 1})));
        assertEquals(Arrays.toString(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}), Arrays.toString(PlusOne.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        assertEquals(Arrays.toString(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6}), Arrays.toString(PlusOne.plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 5})));
    }
}
