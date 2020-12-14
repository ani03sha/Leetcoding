package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_PalindromePartitioningTest {

    private final Problem14_PalindromePartitioning testObject = new Problem14_PalindromePartitioning();

    @Test
    void testPartition() {
        String s = "aab";
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "a", "b"));
        expected.add(Arrays.asList("aa", "b"));
        assertEquals(expected, testObject.partition(s));

        s = "a";
        expected.clear();
        expected.add(Collections.singletonList("a"));
        assertEquals(expected, testObject.partition(s));
    }
}