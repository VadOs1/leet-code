package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    @Test
    void testContainsDuplicate() {
        assertFalse(ContainsDuplicate.containsDuplicate(null));
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{}));
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3}));
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9}));
    }
}
