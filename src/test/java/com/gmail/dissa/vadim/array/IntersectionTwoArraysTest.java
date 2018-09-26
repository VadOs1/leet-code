package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTwoArraysTest {
    @Test
    void testIntersectionTwoArrays() {
        assertEquals(Arrays.toString(new int[]{2, 2}),
                Arrays.toString(IntersectionTwoArrays.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        assertEquals(Arrays.toString(new int[]{9, 4}),
                Arrays.toString(IntersectionTwoArrays.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
