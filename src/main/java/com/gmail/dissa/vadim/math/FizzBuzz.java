package com.gmail.dissa.vadim.math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the
 * multiples of five output “Buzz”. For numbers which are multiples of both three and five
 * output “FizzBuzz”.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(k -> {
            if (k % 3 == 0 && k % 5 == 0) {
                return "FizzBuzz";
            } else if (k % 3 == 0) {
                return "Fizz";
            } else if (k % 5 == 0) {
                return "Buzz";
            }
            return "" + k;
        }).collect(Collectors.toList());
    }
}
