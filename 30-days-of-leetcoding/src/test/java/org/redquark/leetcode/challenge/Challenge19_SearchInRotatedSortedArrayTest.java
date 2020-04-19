package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge19_SearchInRotatedSortedArrayTest {

    private final Challenge19_SearchInRotatedSortedArray testObject = new Challenge19_SearchInRotatedSortedArray();

    @Test
    void search() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int target = 3;
        assertEquals(2, testObject.search(numbers, target));

        numbers = new int[]{3, 4, 5, 6, 1, 2};
        target = 2;
        assertEquals(5, testObject.search(numbers, target));

        numbers = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 0;
        assertEquals(4, testObject.search(numbers, target));

        numbers = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 3;
        assertEquals(-1, testObject.search(numbers, target));
    }
}