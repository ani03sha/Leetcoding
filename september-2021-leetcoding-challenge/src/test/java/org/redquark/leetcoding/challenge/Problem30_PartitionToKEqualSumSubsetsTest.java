package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem30_PartitionToKEqualSumSubsetsTest {

    private final Problem30_PartitionToKEqualSumSubsets testObject = new Problem30_PartitionToKEqualSumSubsets();

    @Test
    void testCanPartitionKSubsets() {
        int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        assertTrue(testObject.canPartitionKSubsets(nums, k));

        nums = new int[]{1, 2, 3, 4};
        k = 3;
        assertFalse(testObject.canPartitionKSubsets(nums, k));
    }
}