package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveZeroesTest {
    @Test
    void testMoveZeroes() {
        int[] testArray = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(testArray);

        assertEquals(Arrays.toString(new int[]{1, 3, 12, 0, 0}),
                Arrays.toString(testArray));
    }
}
