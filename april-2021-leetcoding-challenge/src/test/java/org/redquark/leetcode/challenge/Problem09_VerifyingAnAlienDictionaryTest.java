package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_VerifyingAnAlienDictionaryTest {

    private final Problem09_VerifyingAnAlienDictionary testObject = new Problem09_VerifyingAnAlienDictionary();

    @Test
    void testIsAlienSorted() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(testObject.isAlienSorted(words, order));

        words = new String[]{"word", "world", "row"};
        order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(testObject.isAlienSorted(words, order));

        words = new String[]{"apple", "app"};
        order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(testObject.isAlienSorted(words, order));
    }
}