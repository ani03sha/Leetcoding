package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_BeautifulArrangementTest {

    private final Problem03_BeautifulArrangement testObject = new Problem03_BeautifulArrangement();

    @Test
    void testCountArrangement() {
        assertEquals(2, testObject.countArrangement(2));
        assertEquals(1, testObject.countArrangement(1));
    }
}