package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem27_PartitionEqualSubsetSumTest {

    private final Problem27_PartitionEqualSubsetSum testObject = new Problem27_PartitionEqualSubsetSum();

    @Test
    void testCanPartition() {
        int[] nums = new int[]{1, 5, 11, 5};
        assertTrue(testObject.canPartition(nums));

        nums = new int[]{1, 2, 3, 5};
        assertFalse(testObject.canPartition(nums));
    }
}