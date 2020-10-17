package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_RepeatedDNASequencesTest {

    private final Problem17_RepeatedDNASequences testObject = new Problem17_RepeatedDNASequences();

    @Test
    void testFindRepeatedDnaSequences() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertEquals(expected, testObject.findRepeatedDnaSequences(s));

        s = "AAAAAAAAAAAAA";
        expected = Collections.singletonList("AAAAAAAAAA");
        assertEquals(expected, testObject.findRepeatedDnaSequences(s));
    }
}