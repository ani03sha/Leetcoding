package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_FindDuplicateNumberTest {

    private final Problem25_FindDuplicateNumber testObject = new Problem25_FindDuplicateNumber();

    @Test
    void testFindDuplicate() {
        int[] numbers = new int[]{1, 3, 4, 2, 2};
        assertEquals(2, testObject.findDuplicate(numbers));

        numbers = new int[]{3, 1, 3, 4, 2};
        assertEquals(3, testObject.findDuplicate(numbers));
    }
}