package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem18_RangeSumQueryMutable.NumArray;

class Problem18_RangeSumQueryMutableTest {

    @Test
    void test() {
        int[] nums = {1, 3, 5};
        NumArray numArray = new NumArray(nums);
        assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        assertEquals(8, numArray.sumRange(0, 2));
    }
}