package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeKTest {

    private final Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK testObject =
            new Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK();

    @Test
    void testHasAllCodes() {
        String s = "00110";
        int k = 2;
        assertTrue(testObject.hasAllCodes(s, k));

        s = "0110";
        k = 1;
        assertTrue(testObject.hasAllCodes(s, k));

        s = "0110";
        k = 2;
        assertFalse(testObject.hasAllCodes(s, k));

        s = "0000000001011100";
        k = 4;
        assertFalse(testObject.hasAllCodes(s, k));
    }
}