package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07_ShortestDistanceToACharacterTest {

    private final Problem07_ShortestDistanceToACharacter testObject =
            new Problem07_ShortestDistanceToACharacter();


    @Test
    void testShortestToChar() {
        String s = "loveleetcode";
        char c = 'e';
        int[] expected = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(expected, testObject.shortestToChar(s, c));

        s = "aaab";
        c = 'b';
        expected = new int[]{3, 2, 1, 0};
        assertArrayEquals(expected, testObject.shortestToChar(s, c));
    }
}