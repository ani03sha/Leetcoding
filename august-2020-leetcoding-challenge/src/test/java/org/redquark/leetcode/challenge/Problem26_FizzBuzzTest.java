package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_FizzBuzzTest {

    private final Problem26_FizzBuzz testObject = new Problem26_FizzBuzz();

    @Test
    void testFizzBuzz() {
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, testObject.fizzBuzz(15));
    }
}