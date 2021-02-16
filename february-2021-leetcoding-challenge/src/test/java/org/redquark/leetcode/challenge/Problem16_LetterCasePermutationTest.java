package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_LetterCasePermutationTest {

    private final Problem16_LetterCasePermutation testObject = new Problem16_LetterCasePermutation();

    @Test
    void testLetterCasePermutation() {
        String S = "a1b2";
        List<String> expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertEquals(expected, testObject.letterCasePermutation(S));

        S = "3z4";
        expected = Arrays.asList("3z4", "3Z4");
        assertEquals(expected, testObject.letterCasePermutation(S));

        S = "12345";
        expected = Collections.singletonList("12345");
        assertEquals(expected, testObject.letterCasePermutation(S));

        S = "0";
        expected = Collections.singletonList("0");
        assertEquals(expected, testObject.letterCasePermutation(S));
    }
}