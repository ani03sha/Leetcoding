package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_RemoveElementTest {

    private final Problem06_RemoveElement testObject = new Problem06_RemoveElement();

    @Test
    void testRemoveElement() {
        int[] numbers = new int[]{3, 2, 2, 3};
        int value = 3;
        assertEquals(2, testObject.removeElement(numbers, value));

        numbers = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        value = 2;
        assertEquals(5, testObject.removeElement(numbers, value));

        numbers = new int[]{1};
        value = 1;
        assertEquals(0, testObject.removeElement(numbers, value));

        numbers = new int[]{4, 5};
        value = 5;
        assertEquals(1, testObject.removeElement(numbers, value));
    }
}