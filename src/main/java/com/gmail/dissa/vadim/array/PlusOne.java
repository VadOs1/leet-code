package com.gmail.dissa.vadim.array;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        return new BigInteger(
                IntStream.of(digits)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
        )
                .add(BigInteger.ONE)
                .toString()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }
}
