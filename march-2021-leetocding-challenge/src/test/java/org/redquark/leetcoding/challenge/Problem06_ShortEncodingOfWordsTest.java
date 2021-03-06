package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_ShortEncodingOfWordsTest {

    private final Problem06_ShortEncodingOfWords testObject = new Problem06_ShortEncodingOfWords();

    @Test
    void testMinimumLengthEncoding() {
        String[] words = new String[]{"time", "me", "bell"};
        assertEquals(10, testObject.minimumLengthEncoding(words));

        words = new String[]{"t"};
        assertEquals(2, testObject.minimumLengthEncoding(words));
    }
}