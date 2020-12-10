package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem10_ValidMountainArrayTest {

    private final Problem10_ValidMountainArray testObject = new Problem10_ValidMountainArray();

    @Test
    void validMountainArray() {
        assertFalse(testObject.validMountainArray(new int[]{2, 1}));
        assertFalse(testObject.validMountainArray(new int[]{3, 5, 5}));
        assertTrue(testObject.validMountainArray(new int[]{0, 3, 2, 1}));
    }
}