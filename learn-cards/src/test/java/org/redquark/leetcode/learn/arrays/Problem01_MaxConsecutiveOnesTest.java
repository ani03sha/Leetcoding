package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_MaxConsecutiveOnesTest {

    private final Problem01_MaxConsecutiveOnes testObject = new Problem01_MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes() {
        int[] numbers = new int[]{1, 0, 1, 1, 0, 1, 1, 1};
        assertEquals(3, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{1};
        assertEquals(1, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{0};
        assertEquals(0, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{0, 1, 1, 0, 1, 1, 0, 1, 1};
        assertEquals(2, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{0, 0, 0, 0, 0, 0};
        assertEquals(0, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{1, 1, 1, 1, 1, 1};
        assertEquals(6, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{1, 0, 1, 0, 1, 0, 1};
        assertEquals(1, testObject.findMaxConsecutiveOnes(numbers));

        numbers = new int[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        assertEquals(8, testObject.findMaxConsecutiveOnes(numbers));
    }
}