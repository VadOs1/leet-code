package com.gmail.dissa.vadim.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {
    @Test
    void testReverseString(){
        assertEquals("olleh", ReverseString.reverseString("hello"));
    }
}
