package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem01_DetectCapitalTest {

    private final Problem01_DetectCapital testObject = new Problem01_DetectCapital();

    @Test
    void testDetectCapitalUse() {
        assertTrue(testObject.detectCapitalUse("USA"));
        assertTrue(testObject.detectCapitalUse("leetcode"));
        assertFalse(testObject.detectCapitalUse("FlaG"));
        assertFalse(testObject.detectCapitalUse("aNimal"));
        assertTrue(testObject.detectCapitalUse("Animal"));
    }
}