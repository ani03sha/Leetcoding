package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem23_StreamOfCharactersTest {

    @Test
    void testQuery() {
        String[] words = {"cd", "f", "kl"};
        Problem23_StreamOfCharacters testObject = new Problem23_StreamOfCharacters(words);
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