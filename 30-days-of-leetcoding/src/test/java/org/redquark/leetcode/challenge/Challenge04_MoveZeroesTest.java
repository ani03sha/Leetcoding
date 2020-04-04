package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Challenge04_MoveZeroesTest {

    private Challenge04_MoveZeroes testObject = new Challenge04_MoveZeroes();

    @Test
    void move() {
        int[] numbers = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expected, testObject.move(numbers));

        numbers = new int[]{1, 5, 4, 0, 9, 12, 13, 0, 8, 7, 0, 5, 21, 0, 7};
        expected = new int[]{1, 5, 4, 9, 12, 13, 8, 7, 5, 21, 7, 0, 0, 0, 0};
        assertArrayEquals(expected, testObject.move(numbers));
    }
}