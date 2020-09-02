package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem02_ContainsDuplicatesIIITest {

    private final Problem02_ContainsDuplicatesIII testObject = new Problem02_ContainsDuplicatesIII();

    @Test
    void testContainsNearbyAlmostDuplicate() {
        int[] numbers = new int[]{1, 2, 3, 1};
        int k = 3;
        int t = 0;
        assertTrue(testObject.containsNearbyAlmostDuplicate(numbers, k, t));
    }
}