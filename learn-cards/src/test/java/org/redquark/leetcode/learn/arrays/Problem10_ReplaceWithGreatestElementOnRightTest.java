package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem10_ReplaceWithGreatestElementOnRightTest {

    private final Problem10_ReplaceWithGreatestElementOnRight testObject = new Problem10_ReplaceWithGreatestElementOnRight();

    @Test
    void testReplaceElements() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        assertArrayEquals(expected, testObject.replaceElements(arr));

        arr = new int[]{16, 17, 4, 3, 5, 2};
        expected = new int[]{17, 5, 5, 5, 2, -1};
        assertArrayEquals(expected, testObject.replaceElements(arr));
    }
}