package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_WordSubsetsTest {

    private final Problem26_WordSubsets testObject = new Problem26_WordSubsets();

    @Test
    void testWordSubsets() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"e", "o"};
        List<String> expected = Arrays.asList("facebook", "google", "leetcode");
        assertEquals(expected, testObject.wordSubsets(A, B));

        A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        B = new String[]{"l", "e"};
        expected = Arrays.asList("apple", "google", "leetcode");
        assertEquals(expected, testObject.wordSubsets(A, B));

        A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        B = new String[]{"e", "oo"};
        expected = Arrays.asList("facebook", "google");
        assertEquals(expected, testObject.wordSubsets(A, B));

        A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        B = new String[]{"lo", "eo"};
        expected = Arrays.asList("google", "leetcode");
        assertEquals(expected, testObject.wordSubsets(A, B));

        A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        B = new String[]{"ec", "oc", "ceo"};
        expected = Arrays.asList("facebook", "leetcode");
        assertEquals(expected, testObject.wordSubsets(A, B));
    }
}