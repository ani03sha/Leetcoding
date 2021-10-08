package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve
 * keys in a dataset of strings. There are various applications of this data structure, such as autocomplete
 * and spellchecker.
 * <p>
 * Implement the Trie class:
 * <p>
 * - Trie() Initializes the trie object.
 * - void insert(String word) Inserts the string word into the trie.
 * - boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
 * - boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word.length, prefix.length <= 2000
 * word and prefix consist only of lowercase English letters.
 * At most 3 * 10^4 calls in total will be made to insert, search, and startsWith.
 */
public class Problem08_ImplementTriePrefixTree {

    static class Trie {
        // Array to store the children of the current node
        private final Trie[] children;
        // Boolean variable to represent if the current node is the leaf node
        private boolean isLeaf;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            children = new Trie[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            // Current pointer will be current node
            Trie current = this;
            // Start insertion
            for (char c : word.toCharArray()) {
                // If the node represeting the current character is null, then create it
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new Trie();
                }
                current = current.children[c - 'a'];
            }
            // Make the leaf node
            current.isLeaf = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            // Get the reference of the current node
            Trie current = this;
            // Loop for the characters in the word
            for (char c : word.toCharArray()) {
                // Move current pointer ahead
                current = current.children[c - 'a'];
                // If the node representing current character is null, then return false
                if (current == null) {
                    return false;
                }
            }
            return current.isLeaf;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            // Get the reference of the current node
            Trie current = this;
            // Loop for the characters in the word
            for (char c : prefix.toCharArray()) {
                // Move current pointer ahead
                current = current.children[c - 'a'];
                // If the node representing current character is null, then return false
                if (current == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
