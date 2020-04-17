package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_EvenNumberOfDigitsTest {

    private final Problem02_EvenNumberOfDigits testObject = new Problem02_EvenNumberOfDigits();

    @Test
    void findNumbers() {
        int[] numbers = new int[]{12, 345, 2, 6, 7896};
        assertEquals(2, testObject.findNumbers(numbers));

        numbers = new int[]{555, 901, 482, 1771};
        assertEquals(1, testObject.findNumbers(numbers));
    }
}