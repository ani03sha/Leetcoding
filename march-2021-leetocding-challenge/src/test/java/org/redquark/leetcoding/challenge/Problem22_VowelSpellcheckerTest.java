package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem22_VowelSpellcheckerTest {

    private final Problem22_VowelSpellchecker testObject = new Problem22_VowelSpellchecker();

    @Test
    void testSpellchecker() {
        String[] wordList = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        String[] expected = {"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
        assertArrayEquals(expected, testObject.spellchecker(wordList, queries));
    }
}