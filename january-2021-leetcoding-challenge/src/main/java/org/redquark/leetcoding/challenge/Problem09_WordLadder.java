package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two words beginWord and endWord, and a dictionary wordList, return the length of the
 * shortest transformation sequence from beginWord to endWord, such that:
 * <p>
 * - Only one letter can be changed at a time.
 * - Each transformed word must exist in the word list.
 * <p>
 * Return 0 if there is no such transformation sequence.
 * <p>
 * Constraints:
 * <p>
 * 1 <= beginWord.length <= 100
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * beginWord != endWord
 * All the strings in wordList are unique.
 */
public class Problem09_WordLadder {

    /**
     * @param beginWord - as the name suggests
     * @param endWord   - as the name suggests
     * @param wordList  - list of words in which we need to search
     * @return number of transformations
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Convert List to set for faster retrieval
        Set<String> wordSet = new HashSet<>(wordList);
        // Queue to store the current state
        Queue<WordNode> states = new LinkedList<>();
        // Add the initial state i.e., the beginWord
        states.offer(new WordNode(beginWord, 1));
        // Loop until the queue is empty
        while (!states.isEmpty()) {
            // Get the current state
            WordNode top = states.poll();
            // The word on the top of the queue
            String currentWord = top.word;
            // Check if we have reached the endWord
            if (currentWord.equals(endWord)) {
                return top.steps;
            }
            // Convert the current word into the characters
            char[] wordCharacters = currentWord.toCharArray();
            // Loop for each of its characters
            for (int i = 0; i < wordCharacters.length; i++) {
                // Check by replacing each character in the alphabets
                for (char c = 'a'; c <= 'z'; c++) {
                    // Current character of the currentWord
                    char currentCharacter = wordCharacters[i];
                    // Check if the current alphabet is equal to the current character
                    if (currentCharacter == c) {
                        continue;
                    }
                    // Replace the current character with the current alphabet
                    wordCharacters[i] = c;
                    // Convert the new word to string
                    String newWord = new String(wordCharacters);
                    // Check if this new word exists in the wordList
                    if (wordSet.contains(newWord)) {
                        // Add this new state to the queue
                        states.offer(new WordNode(newWord, top.steps + 1));
                        // Remove this from the list
                        wordSet.remove(newWord);
                    }
                    // Revert the changes we made for the next iteration
                    wordCharacters[i] = currentCharacter;
                }
            }
        }
        return 0;
    }

    static class WordNode {
        String word;
        int steps;

        WordNode(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }
}
