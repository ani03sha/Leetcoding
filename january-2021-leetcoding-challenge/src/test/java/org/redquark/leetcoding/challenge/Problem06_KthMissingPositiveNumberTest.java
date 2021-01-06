package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_KthMissingPositiveNumberTest {

    private final Problem06_KthMissingPositiveNumber testObject =
            new Problem06_KthMissingPositiveNumber();

    @Test
    void testFindKthPositive() {
        int[] arr = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        assertEquals(9, testObject.findKthPositive(arr, k));

        arr = new int[]{1, 2, 3, 4};
        k = 2;
        assertEquals(6, testObject.findKthPositive(arr, k));
    }
}