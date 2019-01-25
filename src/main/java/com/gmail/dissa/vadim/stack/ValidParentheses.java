package com.gmail.dissa.vadim.stack;

import java.util.ArrayDeque;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s == null) {
			return false;
		}

		if (s.length() == 0) {
			return true;
		}

		char[] chars = s.toCharArray();
		
		ArrayDeque<Character> deque = new ArrayDeque<>();

		for (char current : chars) {
			Character prev = deque.peek();

			if (prev == null) {
				deque.push(current);
				continue;
			}

			if (isClosingChar(prev, current)) {
				deque.pop();
			} else {
				deque.push(current);
			}
		}

		return deque.isEmpty();
	}

	private boolean isClosingChar(char prev, char current) {
		if (prev == '(') {
			return current == ')';
		} else if (prev == ')') {
			return current == '(';
		} else if (prev == '{') {
			return current == '}';
		} else if (prev == '}') {
			return current == '{';
		} else if (prev == '[') {
			return current == ']';
		} else if (prev == ']') {
			return current == '[';
		}
		return false;
	}
}
