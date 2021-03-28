package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_ReconstructOriginalDigitsFromEnglishTest {

    private final Problem28_ReconstructOriginalDigitsFromEnglish testObject =
            new Problem28_ReconstructOriginalDigitsFromEnglish();

    @Test
    void testOriginalDigits() {
        assertEquals("012", testObject.originalDigits("owoztneoer"));
        assertEquals("45", testObject.originalDigits("fviefuro"));
    }
}