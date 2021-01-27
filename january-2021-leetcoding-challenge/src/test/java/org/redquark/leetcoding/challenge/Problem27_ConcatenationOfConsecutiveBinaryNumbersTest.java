package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_ConcatenationOfConsecutiveBinaryNumbersTest {

    private final Problem27_ConcatenationOfConsecutiveBinaryNumbers testObject =
            new Problem27_ConcatenationOfConsecutiveBinaryNumbers();

    @Test
    void testConcatenatedBinary() {
        assertEquals(1, testObject.concatenatedBinary(1));
        assertEquals(27, testObject.concatenatedBinary(3));
        assertEquals(505379714, testObject.concatenatedBinary(12));
    }
}