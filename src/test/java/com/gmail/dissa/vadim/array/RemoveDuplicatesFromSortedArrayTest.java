package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void testDuplicatesRemoval() {
        assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(null));
        assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{}));
        assertEquals(1, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1}));
        assertEquals(1, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1}));
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2}));
        assertEquals(3, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 3}));
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 2}));
        assertEquals(4, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 3, 4}));
        assertEquals(6, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6}));
    }
}
