package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_NumberOfValidWordsForEachPuzzleTest {

    private final Problem09_NumberOfValidWordsForEachPuzzle testObject = new Problem09_NumberOfValidWordsForEachPuzzle();

    @Test
    void testFindNumOfValidWords() {
        String[] words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> expected = Arrays.asList(1, 1, 3, 2, 4, 0);
        assertEquals(expected, testObject.findNumOfValidWords(words, puzzles));

        words = new String[]{"apple", "pleas", "please"};
        puzzles = new String[]{"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"};
        expected = Arrays.asList(0, 1, 3, 2, 0);
        assertEquals(expected, testObject.findNumOfValidWords(words, puzzles));
    }
}