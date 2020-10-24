package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_BagOfTokensTest {

    private final Problem24_BagOfTokens testObject = new Problem24_BagOfTokens();

    @Test
    void testBagOfTokensScore() {
        int[] tokens = new int[]{100};
        int P = 50;
        assertEquals(0, testObject.bagOfTokensScore(tokens, P));

        tokens = new int[]{100, 200};
        P = 150;
        assertEquals(1, testObject.bagOfTokensScore(tokens, P));

        tokens = new int[]{100, 200, 300, 400};
        P = 200;
        assertEquals(2, testObject.bagOfTokensScore(tokens, P));
    }
}