package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_PartitionArrayIntoDisjointIntervalsTest {

    private final Problem22_PartitionArrayIntoDisjointIntervals testObject =
            new Problem22_PartitionArrayIntoDisjointIntervals();

    @Test
    void testPartitionDisjoint() {
        int[] nums = new int[]{5, 0, 3, 8, 6};
        assertEquals(3, testObject.partitionDisjoint(nums));

        nums = new int[]{1, 1, 1, 0, 6, 12};
        assertEquals(4, testObject.partitionDisjoint(nums));
    }
}