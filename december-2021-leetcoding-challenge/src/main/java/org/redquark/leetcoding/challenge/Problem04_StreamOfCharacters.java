package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a
 * string of a given array of strings words.
 * <p>
 * For example, if words = ["abc", "xyz"] and the stream added the four characters (one by one) 'a', 'x', 'y',
 * and 'z', your algorithm should detect that the suffix "xyz" of the characters "axyz" matches "xyz" from words.
 * <p>
 * Implement the StreamChecker class:
 * <p>
 * StreamChecker(String[] words) Initializes the object with the strings array words.
 * boolean query(char letter) Accepts a new character from the stream and returns true if any non-empty suffix
 * from the stream forms a word that is in words.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 2000
 * words[i] consists of lowercase English letters.
 * letter is a lowercase English letter.
 * At most 4 * 104 calls will be made to query.
 */
public class Problem04_StreamOfCharacters {


    static class StreamChecker {

        private final TrieNode root;
        private final StringBuilder output;


        public StreamChecker(String[] words) {
            this.root = new TrieNode();
            this.output = new StringBuilder();
            createTrie(words);
        }

        public boolean query(char letter) {
            output.append(letter);
            TrieNode node = root;
            for (int i = output.length() - 1; i >= 0 && node != null; i--) {
                char c = output.charAt(i);
                node = node.next[c - 'a'];
                if (node != null && node.isWord) {
                    return true;
                }
            }
            return false;
        }

        private void createTrie(String[] words) {
            for (String word : words) {
                TrieNode node = root;
                int n = word.length();
                for (int i = n - 1; i >= 0; i--) {
                    char c = word.charAt(i);
                    if (node.next[c - 'a'] == null) {
                        node.next[c - 'a'] = new TrieNode();
                    }
                    node = node.next[c - 'a'];
                }
                node.isWord = true;
            }
        }

        static class TrieNode {
            boolean isWord;
            TrieNode[] next = new TrieNode[26];
        }
    }
}
