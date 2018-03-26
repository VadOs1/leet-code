package com.gmail.dissa.vadim.string;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] cs = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            swap(cs, start, end);
            start++;
            end--;
        }

        return new String(cs);
    }

    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
