package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_MaximumPointsYouCanObtainFromCardsTest {

    private final Problem11_MaximumPointsYouCanObtainFromCards testObject =
            new Problem11_MaximumPointsYouCanObtainFromCards();

    @Test
    void testMaxScore() {
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        assertEquals(12, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{2, 2, 2};
        k = 2;
        assertEquals(4, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{9, 7, 7, 9, 7, 7, 9};
        k = 7;
        assertEquals(55, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{1, 1000, 1};
        k = 1;
        assertEquals(1, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{1, 79, 80, 1, 1, 1, 200, 1};
        k = 3;
        assertEquals(202, testObject.maxScore(cardPoints, k));
    }
}