package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a data structure that supports the following two operations:
 * <p>
 * void addWord(word)
 * bool search(word)
 * <p>
 * search(word) can search a literal word or a regular expression string containing only letters a-z or '.'.
 * A '.' means it can represent any one letter.
 * <p>
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class Problem05_AddAndSearchWord {

    // Root of the Trie
    Node root;

    /**
     * Initialize your data structure here.
     */
    public Problem05_AddAndSearchWord() {
        root = new Node();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        // Reference of the root
        Node n = root;
        // Store each character as a node in Trie
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // Index
            int index = c - 'a';
            // Check if the value at index is null or not
            if (n.internalArray[index] == null) {
                // Create a new node
                Node temp = new Node();
                // Save the data at that index
                n.internalArray[index] = temp;
                // Move the pointer to the temp
                n = temp;
            } else {
                // Move further
                n = n.internalArray[index];
            }
        }
        n.isLeaf = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    private boolean dfs(Node node, String word, int start) {
        // Check for leaf node
        if (node.isLeaf && start == word.length()) {
            return true;
        }
        if (start >= word.length()) {
            return false;
        }
        // Current character
        char c = word.charAt(start);
        // Check for period sign
        if (c == '.') {
            boolean result = false;
            for (int i = 0; i < 26; i++) {
                if (node.internalArray[i] != null) {
                    if (dfs(node.internalArray[i], word, start + 1)) {
                        result = true;
                        break;
                    }
                }
            }
            return result;
        } else {
            // Get the index
            int index = c - 'a';
            if (node.internalArray[index] != null) {
                return dfs(node.internalArray[index], word, start + 1);
            } else {
                return false;
            }
        }
    }

    static class Node {
        boolean isLeaf;
        Node[] internalArray;

        Node() {
            internalArray = new Node[26];
        }
    }
}
