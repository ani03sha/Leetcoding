package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_WordLadderTest {

    private final Problem09_WordLadder testObject = new Problem09_WordLadder();

    @Test
    void testLadderLength() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        assertEquals(5, testObject.ladderLength(beginWord, endWord, wordList));

        wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        assertEquals(0, testObject.ladderLength(beginWord, endWord, wordList));
    }
}