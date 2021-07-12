package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem12_IsomorphicStringsTest {

    private final Problem12_IsomorphicStrings testObject = new Problem12_IsomorphicStrings();

    @Test
    void testIsIsomorphic() {
        String s = "egg";
        String t = "add";
        assertTrue(testObject.isIsomorphic(s, t));

        s = "foo";
        t = "bar";
        assertFalse(testObject.isIsomorphic(s, t));

        s = "paper";
        t = "title";
        assertTrue(testObject.isIsomorphic(s, t));
    }
}