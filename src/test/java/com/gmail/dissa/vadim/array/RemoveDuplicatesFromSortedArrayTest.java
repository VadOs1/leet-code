package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void testDuplicatesRemoval() {
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(null), 0);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{}), 0);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1}), 1);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1}), 1);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2}), 2);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 3}), 3);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 2}), 2);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 3, 4}), 4);
        assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6}), 6);
    }
}
