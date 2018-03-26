package com.gmail.dissa.vadim.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    @Test
    void testReverseIntegerCase() {
        assertEquals(321, ReverseInteger.reverse(123));
        assertEquals(-321, ReverseInteger.reverse(-123));
        assertEquals(21, ReverseInteger.reverse(120));
        assertEquals(0, ReverseInteger.reverse(1534236649));
    }
}
