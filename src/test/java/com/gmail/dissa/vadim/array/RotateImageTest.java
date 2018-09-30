package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateImageTest {
    @Test
    void testRotate() {
        int[] a = new int[]{5, 1, 9, 11};
        int[] b = new int[]{2, 4, 8, 10};
        int[] c = new int[]{13, 3, 6, 7};
        int[] d = new int[]{15, 14, 12, 16};
        int[][] targetArray = new int[][]{a, b, c, d};

        RotateImage.rotate(targetArray);

        int[] a1 = new int[]{15, 13, 2, 5};
        int[] b1 = new int[]{14, 3, 4, 1};
        int[] c1 = new int[]{12, 6, 8, 9};
        int[] d1 = new int[]{16, 7, 10, 11};
        int[][] expectedArray = new int[][]{a1, b1, c1, d1};

        assertArrayEquals(expectedArray, targetArray);
    }
}