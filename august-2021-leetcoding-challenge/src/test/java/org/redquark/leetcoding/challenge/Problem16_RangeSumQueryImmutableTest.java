package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem16_RangeSumQueryImmutable.NumArray;

class Problem16_RangeSumQueryImmutableTest {

    @Test
    void test() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }
}