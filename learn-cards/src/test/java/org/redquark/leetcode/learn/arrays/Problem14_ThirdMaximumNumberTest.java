package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_ThirdMaximumNumberTest {

    private final Problem14_ThirdMaximumNumber testObject = new Problem14_ThirdMaximumNumber();

    @Test
    void testThirdMax() {
        int[] numbers = new int[]{3, 2, 1};
        assertEquals(1, testObject.thirdMax(numbers));

        numbers = new int[]{1, 2};
        assertEquals(2, testObject.thirdMax(numbers));
    }
}