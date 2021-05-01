package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a special dictionary which has some words and allows you to search the words in it by a prefix and a suffix.
 * <p>
 * Implement the WordFilter class:
 * <p>
 * - WordFilter(string[] words) Initializes the object with the words in the dictionary.
 * - f(string prefix, string suffix) Returns the index of the word in the dictionary which has the prefix and the suffix.
 * If there is more than one valid index, return the largest of them.
 * If there is no such word in the dictionary, return -1.
 * <p>
 * Constraints:
 * <p>
 * - 1 <= words.length <= 15000
 * - 1 <= words[i].length <= 10
 * - 1 <= prefix.length, suffix.length <= 10
 * - words[i], prefix and suffix consist of lower-case English letters only.
 * - At most 15000 calls will be made to the function f.
 */
public class Problem01_PrefixAndSuffixSearch {

    static class WordFilter {
        // Root of the trie
        private final TrieNode root;

        public WordFilter(String[] words) {
            // Create the root of the Trie
            root = new TrieNode();
            // Loop through every word in the dictionary
            for (int i = 0; i < words.length; i++) {
                // Generate a new word by prepending '{"
                String word = "{" + words[i];
                // Insert this word in the Trie
                insert(root, word, i);
                // Add words which will be formed by prepending
                // "word" calculated in above step with each
                // character at a time starting from right 
                for (int j = 0; j < word.length(); j++) {
                    // Skip first '{'
                    insert(root, word.substring(j + 1) + word, i);
                }
            }
        }

        private void insert(TrieNode root, String word, int weight) {
            // Get the current node
            TrieNode current = root;
            // Insert the words in Trie character by character
            for (char c : word.toCharArray()) {
                // Index for this character
                int index = c - 'a';
                // Check if we have already created a node at
                // index "index"
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                // Move to that child
                current = current.children[index];
                current.weight = weight;
            }
        }

        public int f(String prefix, String suffix) {
            // Current node we are at
            TrieNode current = root;
            // Search for the word with given prefix and
            // suffix in the Trie
            for (char c : (suffix + "{" + prefix).toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return -1;
                }
                // Move to that child
                current = current.children[c - 'a'];
            }
            return current.weight;
        }

        static class TrieNode {
            private final TrieNode[] children;
            private int weight;

            TrieNode() {
                this.weight = 0;
                // Size explanation - a-z have 26 characters and 27th
                // space is left for "{" which is next to 'z' in ASCII.
                this.children = new TrieNode[27];
            }
        }
    }
}
