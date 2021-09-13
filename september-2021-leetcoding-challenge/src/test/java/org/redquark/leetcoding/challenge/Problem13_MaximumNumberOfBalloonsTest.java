package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_MaximumNumberOfBalloonsTest {

    private final Problem13_MaximumNumberOfBalloons testObject = new Problem13_MaximumNumberOfBalloons();

    @Test
    void testMaxNumberOfBalloons() {
        String text = "nlaebolko";
        assertEquals(1, testObject.maxNumberOfBalloons(text));

        text = "loonbalxballpoon";
        assertEquals(2, testObject.maxNumberOfBalloons(text));

        text = "leetcode";
        assertEquals(0, testObject.maxNumberOfBalloons(text));
    }
}