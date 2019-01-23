package com.gmail.dissa.vadim.string;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

public class LongestSubstrWithoutRepeatingChars {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		if (s.length() == 1) {
			return 1;
		}

		char[] chars = s.toCharArray();

		int maxLength = 1;
		Set<Character> set;

		for (int i = 0; i < chars.length - 1; i++) {
			set = new HashSet<>();
			set.add(chars[i]);
			int length = 1;
			for (int k = i + 1; k < chars.length; k++) {
				if (set.add(chars[k])) {
					length++;
					if (length > maxLength) {
						maxLength = length;
					}
				} else {
					break;
				}
			}
		}

		return maxLength;
	}
}
