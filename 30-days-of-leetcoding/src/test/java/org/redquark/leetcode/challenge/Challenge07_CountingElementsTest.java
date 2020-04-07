package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge07_CountingElementsTest {

    private Challenge07_CountingElements testObject = new Challenge07_CountingElements();

    @Test
    void countElements() {
        int[] input = new int[]{1, 2, 3};
        assertEquals(2, testObject.countElements(input));

        input = new int[]{1, 1, 3, 3, 5, 5, 7, 7};
        assertEquals(0, testObject.countElements(input));

        input = new int[]{1, 3, 2, 3, 5, 0};
        assertEquals(3, testObject.countElements(input));

        input = new int[]{1, 1, 2, 2};
        assertEquals(2, testObject.countElements(input));
    }
}