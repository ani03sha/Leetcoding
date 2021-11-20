package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_SingleElementInASortedArrayTest {

    private final Problem20_SingleElementInASortedArray testObject = new Problem20_SingleElementInASortedArray();

    @Test
    void testSingleNonDuplicate() {
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        assertEquals(2, testObject.singleNonDuplicate(nums));

        nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        assertEquals(10, testObject.singleNonDuplicate(nums));
    }
}