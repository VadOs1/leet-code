package com.gmail.dissa.vadim.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    @Test
    void testValidPalindrome() {
        assertFalse(ValidPalindrome.isPalindrome(null));
        assertTrue(ValidPalindrome.isPalindrome(""));
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(ValidPalindrome.isPalindrome("race a car"));
    }
}
