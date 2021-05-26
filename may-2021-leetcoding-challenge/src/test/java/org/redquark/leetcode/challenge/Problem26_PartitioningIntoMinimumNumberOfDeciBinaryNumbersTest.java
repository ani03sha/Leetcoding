package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    private final Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbers testObject =
            new Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    void testMinPartitions() {
        String s = "32";
        assertEquals(3, testObject.minPartitions(s));

        s = "82734";
        assertEquals(8, testObject.minPartitions(s));

        s = "27346209830709182346";
        assertEquals(9, testObject.minPartitions(s));
    }
}