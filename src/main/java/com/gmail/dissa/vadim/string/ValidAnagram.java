package com.gmail.dissa.vadim.string;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--letters[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * char[] chars = s.toCharArray();
 *     Arrays.sort(chars);
 *     s = String.valueOf(chars);
 *
 *     char[] chart = t.toCharArray();
 *     Arrays.sort(chart);
 *     t = String.valueOf(chart);
 *
 *     for (int i = 0; i < s.length(); i++) {
 *         if (s.charAt(i) != t.charAt(i)) {
 *             return false;
 *         }
 *     }
 */
