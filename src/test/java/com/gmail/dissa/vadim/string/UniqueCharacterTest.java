package com.gmail.dissa.vadim.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueCharacterTest {
    @Test
    void testUniqueCharacter() {
        assertEquals(-1, UniqueCharacter.firstUniqChar(""));
        assertEquals(-1, UniqueCharacter.firstUniqChar(null));
        assertEquals(0, UniqueCharacter.firstUniqChar("leetcode"));
        assertEquals(2, UniqueCharacter.firstUniqChar("loveleetcode"));
        assertEquals(-1, UniqueCharacter.firstUniqChar("aaa"));
        assertEquals(0, UniqueCharacter.firstUniqChar("a"));
        assertEquals(0, UniqueCharacter.firstUniqChar("ab"));
        assertEquals(1, UniqueCharacter.firstUniqChar("bab"));
        assertEquals(-1, UniqueCharacter.firstUniqChar("aadadaad"));
        assertEquals(8, UniqueCharacter.firstUniqChar("dddccdbba"));
    }
}
