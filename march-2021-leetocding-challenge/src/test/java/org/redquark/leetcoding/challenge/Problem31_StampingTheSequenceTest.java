package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem31_StampingTheSequenceTest {

    private final Problem31_StampingTheSequence testObject = new Problem31_StampingTheSequence();

    @Test
    void testMovesToStamp() {
        String stamp = "abc";
        String target = "ababc";
        int[] expected = new int[]{0, 2};
        assertArrayEquals(expected, testObject.movesToStamp(stamp, target));

        stamp = "abca";
        target = "aabcaca";
        expected = new int[]{0, 3, 1};
        assertArrayEquals(expected, testObject.movesToStamp(stamp, target));
    }
}