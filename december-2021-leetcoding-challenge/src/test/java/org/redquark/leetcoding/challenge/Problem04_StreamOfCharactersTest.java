package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcoding.challenge.Problem04_StreamOfCharacters.StreamChecker;

class Problem04_StreamOfCharactersTest {

    @Test
    void test() {
        String[] words = new String[]{"cd", "f", "kl"};
        StreamChecker testObject = new StreamChecker(words);
        assertFalse(testObject.query('a'));
        assertFalse(testObject.query('b'));
        assertFalse(testObject.query('c'));
        assertTrue(testObject.query('d'));
        assertFalse(testObject.query('e'));
        assertTrue(testObject.query('f'));
        assertFalse(testObject.query('g'));
        assertFalse(testObject.query('h'));
        assertFalse(testObject.query('i'));
        assertFalse(testObject.query('j'));
        assertFalse(testObject.query('k'));
        assertTrue(testObject.query('l'));
    }
}