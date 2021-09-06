package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_SlowestKeyTest {

    private final Problem06_SlowestKey testObject = new Problem06_SlowestKey();

    @Test
    void testSlowestKey() {
        int[] releaseTimes = new int[]{9, 29, 49, 50};
        String keys = "cbcd";
        assertEquals('c', testObject.slowestKey(releaseTimes, keys));

        releaseTimes = new int[]{12, 23, 36, 46, 62};
        keys = "spuda";
        assertEquals('a', testObject.slowestKey(releaseTimes, keys));
    }
}