package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_OnesAndZeroesTest {

    private final Problem02_OnesAndZeroes testObject = new Problem02_OnesAndZeroes();

    @Test
    void testFindMaxForm() {
        String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, testObject.findMaxForm(strs, m, n));

        strs = new String[]{"10", "0", "1"};
        m = 1;
        n = 1;
        assertEquals(2, testObject.findMaxForm(strs, m, n));
    }
}