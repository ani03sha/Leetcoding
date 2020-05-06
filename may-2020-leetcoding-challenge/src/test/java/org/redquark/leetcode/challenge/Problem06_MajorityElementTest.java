package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MajorityElementTest {

    private final Problem06_MajorityElement testObject = new Problem06_MajorityElement();

    @Test
    void majorityElement() {
        int[] numbers = new int[]{3, 2, 3};
        assertEquals(3, testObject.majorityElement(numbers));

        numbers = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, testObject.majorityElement(numbers));
    }
}