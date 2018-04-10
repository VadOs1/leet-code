package com.gmail.dissa.vadim.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    @Test
    void testValidAnagram(){
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }
}
