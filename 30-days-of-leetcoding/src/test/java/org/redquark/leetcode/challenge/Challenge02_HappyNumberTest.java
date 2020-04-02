package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Challenge02_HappyNumberTest {

    private Challenge02_HappyNumber testObject = new Challenge02_HappyNumber();

    @Test
    void testIsHappy() {
        assertTrue(testObject.isHappy(19));
        assertTrue(testObject.isHappy(7));
        assertFalse(testObject.isHappy(6));
        assertTrue(testObject.isHappy(1));
        assertFalse(testObject.isHappy(69));
    }
}