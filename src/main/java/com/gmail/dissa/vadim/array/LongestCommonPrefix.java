package com.gmail.dissa.vadim.array;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * All given inputs are in lowercase letters a-z.*/

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		int minLen = Integer.MAX_VALUE;

		for (String str : strs) {
			minLen = Math.min(minLen, str.length());
		}

		int low = 1;
		int high = minLen;

		while (low <= high) {
			int middle = (low + high) / 2;

			if (isCommonPrefix(strs, middle)) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}

		return strs[0].substring(0, (low + high) / 2);
	}

	private boolean isCommonPrefix(String[] strs, int len) {

		String str1 = strs[0].substring(0, len);

		for (int i = 1; i < strs.length; i++) {
			if (!strs[i].startsWith(str1)) {
				return false;
			}
		}

		return true;
	}
}
