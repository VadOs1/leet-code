package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {
    @Test
    void rotateArrayTest() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotateArray.rotate(array, 3);
        assertArrayEquals(array, new int[]{5, 6, 7, 1, 2, 3, 4});
    }
}
