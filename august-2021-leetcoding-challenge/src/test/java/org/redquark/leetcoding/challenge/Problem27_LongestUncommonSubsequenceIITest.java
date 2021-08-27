package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_LongestUncommonSubsequenceIITest {

    private final Problem27_LongestUncommonSubsequenceII testObject = new Problem27_LongestUncommonSubsequenceII();

    @Test
    void testFindLUSLength() {
        String[] strs = new String[]{"aba", "cdc", "eae"};
        assertEquals(3, testObject.findLUSLength(strs));

        strs = new String[]{"aaa", "aaa", "aa"};
        assertEquals(-1, testObject.findLUSLength(strs));
    }
}