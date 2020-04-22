package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge22_SubarraySumEqualsKTest {

    private final Challenge22_SubarraySumEqualsK testObject = new Challenge22_SubarraySumEqualsK();

    @Test
    void subarraySum() {
        int[] numbers = new int[]{1, 1, 1};
        int k = 2;
        assertEquals(2, testObject.subarraySum(numbers, k));

        numbers = new int[]{1, 2, 3, 1, 2, 4};
        k = 3;
        assertEquals(3, testObject.subarraySum(numbers, k));

        numbers = new int[]{};
        k = 1;
        assertEquals(0, testObject.subarraySum(numbers, k));
    }
}