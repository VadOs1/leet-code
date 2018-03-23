package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    @Test
    void testSingleNumber() {
        assertEquals(94, SingleNumber.singleNumber(new int[]{1, 1, 2, 2, 94, 3, 3})  );
    }
}
