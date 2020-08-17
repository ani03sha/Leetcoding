package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem17_DistributeCandiesToPeopleTest {

    private final Problem17_DistributeCandiesToPeople testObject = new Problem17_DistributeCandiesToPeople();

    @Test
    void testDistributeCandies() {
        int candies = 7;
        int numberOfPeople = 4;
        int[] expected = new int[]{1, 2, 3, 1};
        assertArrayEquals(expected, testObject.distributeCandies(candies, numberOfPeople));

        candies = 10;
        numberOfPeople = 3;
        expected = new int[]{5, 2, 3};
        assertArrayEquals(expected, testObject.distributeCandies(candies, numberOfPeople));
    }
}