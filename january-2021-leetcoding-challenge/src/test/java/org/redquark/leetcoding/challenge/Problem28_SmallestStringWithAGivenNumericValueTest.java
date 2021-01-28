package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_SmallestStringWithAGivenNumericValueTest {

    private final Problem28_SmallestStringWithAGivenNumericValue testObject =
            new Problem28_SmallestStringWithAGivenNumericValue();

    @Test
    void testGetSmallestString() {
        assertEquals("aay", testObject.getSmallestString(3, 27));
        assertEquals("aaszz", testObject.getSmallestString(5, 73));
    }
}