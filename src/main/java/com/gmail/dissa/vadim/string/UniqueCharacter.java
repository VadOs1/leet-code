package com.gmail.dissa.vadim.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class UniqueCharacter {
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }

        char[] arr = s.toCharArray();
        List<Character> foundChars = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!foundChars.contains(arr[i])) {
                int count = 0;
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                        foundChars.add(arr[i]);
                        break;
                    }
                }
                if (count == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
