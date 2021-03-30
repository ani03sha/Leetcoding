package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_RussianDollEnvelopesTest {

    private final Problem30_RussianDollEnvelopes testObject =
            new Problem30_RussianDollEnvelopes();

    @Test
    void testMaxEnvelopes() {
        int[][] envelopes = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        assertEquals(3, testObject.maxEnvelopes(envelopes));

        envelopes = new int[][]{{1, 1}, {1, 1}, {1, 1}};
        assertEquals(1, testObject.maxEnvelopes(envelopes));
    }
}