package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_DistinctSubsequencesTest {

    private final Problem19_DistinctSubsequences testObject = new Problem19_DistinctSubsequences();

    @Test
    void testNumDistinct() {
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(3, testObject.numDistinct(s, t));

        s = "babgbag";
        t = "bag";
        assertEquals(5, testObject.numDistinct(s, t));
    }
}