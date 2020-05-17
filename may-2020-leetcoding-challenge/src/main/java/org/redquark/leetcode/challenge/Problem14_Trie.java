package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement a trie with insert, search, and startsWith methods.
 */
public class Problem14_Trie {

    // Root of the trie
    protected Node root;

    public Problem14_Trie() {
        // Root node is empty
        root = new Node();
    }

    /**
     * @param word - word to be inserted in the trie
     */
    public void insert(String word) {
        // Get the reference of the children of the root
        Map<Character, Node> children = root.children;
        // Loop through each character of the word
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!children.containsKey(c)) {
                Node node = new Node();
                children.put(c, node);
            }
            // Get the node containing c
            Node node = children.get(c);
            if (i == word.length() - 1) {
                node.isLeaf = true;
            }
            children = node.children;
        }
    }

    /**
     * @param word - word to be searched
     * @return - true, if the word is present
     */
    public boolean search(String word) {
        Node node = searchNode(word);
        return node != null && node.isLeaf;
    }

    /**
     * @param prefix - prefix of a word
     * @return true, if prefix exists
     */
    public boolean startsWith(String prefix) {
        Node node = searchNode(prefix);
        return node != null;
    }

    private Node searchNode(String s) {
        // Get the reference of the children of the root
        Map<Character, Node> children = root.children;
        // Get the reference of the root
        Node node = root;
        // Loop for each character in the word
        for (int i = 0; i < s.length(); i++) {
            if (!children.containsKey(s.charAt(i))) {
                return null;
            }
            node = children.get(s.charAt(i));
            children = node.children;
        }
        return node;
    }

    /**
     * This class represents each node in the Trie
     */
    static class Node {
        boolean isLeaf;
        Map<Character, Node> children;

        Node() {
            isLeaf = false;
            children = new HashMap<>();
        }
    }
}
