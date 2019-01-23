package com.gmail.dissa.vadim.string;

/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * Example 1:
 * Input: 121
 * Output: true
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		return s.substring(0, s.length() / 2)
				.endsWith(new StringBuilder(s.length() % 2 == 0 ? s.substring(s.length() / 2, s.length())
						: s.substring(s.length() / 2 + 1, s.length())).reverse().toString());
	}
}
