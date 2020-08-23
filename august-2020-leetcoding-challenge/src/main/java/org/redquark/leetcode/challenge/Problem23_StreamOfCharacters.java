package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement the StreamChecker class as follows:
 * <p>
 * StreamChecker(words): Constructor, init the data structure with the given words.
 * query(letter): returns true if and only if for some k >= 1, the last k characters queried
 * (in order from oldest to newest, including this letter just queried) spell one of the words
 * in the given list.
 * <p>
 * Note:
 * <p>
 * 1. 1 <= words.length <= 2000
 * 2. 1 <= words[i].length <= 2000
 * 3. Words will only consist of lowercase English letters.
 * 4. Queries will only consist of lowercase English letters.
 * 5. The number of queries is at most 40000.
 */
public class Problem23_StreamOfCharacters {

    private final Trie trie;
    private final StringBuilder sb;

    public Problem23_StreamOfCharacters(String[] words) {
        trie = new Trie();
        sb = new StringBuilder();
        for (String word : words) {
            insert(word);
        }
    }

    private void insert(String word) {
        Trie current = trie;
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            Trie next = current.children[c - 'a'];
            if (next == null) {
                current.children[c - 'a'] = next = new Trie();
            }
            current = next;
        }
        current.endOfWord = true;
    }

    public boolean query(char letter) {
        boolean result = false;
        sb.append(letter);
        Trie current = trie;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (current.children[c - 'a'] == null) {
                return false;
            }
            current = current.children[c - 'a'];
            if (current.endOfWord) {
                return true;
            }
        }
        return false;
    }

    static class Trie {
        boolean endOfWord;
        Trie[] children;

        Trie() {
            endOfWord = false;
            children = new Trie[26];
        }
    }
}
