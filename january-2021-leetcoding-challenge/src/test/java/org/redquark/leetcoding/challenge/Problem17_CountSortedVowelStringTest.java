package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_CountSortedVowelStringTest {

    private final Problem17_CountSortedVowelString testObject =
            new Problem17_CountSortedVowelString();

    @Test
    void testCountVowelStrings() {
        assertEquals(5, testObject.countVowelStrings(1));
        assertEquals(15, testObject.countVowelStrings(2));
        assertEquals(66045, testObject.countVowelStrings(33));
    }
}