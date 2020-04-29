package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_CheckIfDoubleExistsTest {

    private final Problem08_CheckIfDoubleExists testObject = new Problem08_CheckIfDoubleExists();

    @Test
    void checkIfExist() {
        int[] arr = new int[]{10, 2, 5, 3};
        assertTrue(testObject.checkIfExist(arr));

        arr = new int[]{7, 1, 14, 11};
        assertTrue(testObject.checkIfExist(arr));

        arr = new int[]{3, 1, 7, 11};
        assertFalse(testObject.checkIfExist(arr));

        arr = new int[]{2};
        assertFalse(testObject.checkIfExist(arr));

        arr = new int[]{};
        assertFalse(testObject.checkIfExist(arr));
    }
}