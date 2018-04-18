package com.gmail.dissa.vadim.string;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }

        String cleanStr = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c) || Character.isDigit(c))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        return cleanStr.equalsIgnoreCase(reversedStr);
    }
}
