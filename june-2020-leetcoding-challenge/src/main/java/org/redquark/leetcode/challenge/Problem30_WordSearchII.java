package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a 2D board and a list of words from the dictionary, find all words in the board.
 * <p>
 * Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those
 * horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 * <p>
 * Note:
 * <p>
 * All inputs are consist of lowercase letters a-z.
 * The values of words are distinct.
 */
public class Problem30_WordSearchII {

    /**
     * @param board - board of characters
     * @param words - dictionary
     * @return words found in board
     */
    public List<String> findWords(char[][] board, String[] words) {
        // Result list
        List<String> result = new ArrayList<>();
        // Base conditions
        if (board == null || board[0] == null || words == null) {
            return result;
        }
        // Set that will store the unique words
        Set<String> set = new TreeSet<>();
        // Array that will check if we have visited this character
        boolean[][] visited = new boolean[board.length][board[0].length];
        // Create a Trie and put words into it
        Trie trie = new Trie();
        // Loop for each word in the dictionary
        for (String word : words) {
            trie.insert(word);
        }
        // Scan the board and check if the word is in the Trie
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                wordSearch(i, j, board, visited, set, trie.root);
            }
        }
        return new ArrayList<>(set);
    }

    private void wordSearch(int row, int column, char[][] board, boolean[][] visited, Set<String> set, Node node) {
        // Rows and columns
        int m = board.length;
        int n = board[0].length;
        // Base condition
        if (row < 0 || row >= m || column < 0 || column >= n || visited[row][column]) {
            return;
        }
        // Current character
        char c = board[row][column];
        // Check if found in the children of current Trie node
        if (node.children[c - 'a'] == null) {
            return;
        }
        // Mark visited true
        visited[row][column] = true;
        // Move to the sub child of the current child
        node = node.children[c - 'a'];
        // If the word is found
        if (!node.word.isEmpty()) {
            set.add(node.word);
        }
        // Direction array
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // Loop to check in each direction
        for (int[] direction : directions) {
            wordSearch(row + direction[0], column + direction[1],
                    board, visited, set, node);
        }
        visited[row][column] = false;

    }


    /**
     * This class represents Trie data structure
     */
    static class Trie {
        // Root of the Trie
        Node root;

        Trie() {
            root = new Node();
        }

        public void insert(String word) {
            // Reference of the node
            Node temp = root;
            // Loop for each character in the word
            for (char c : word.toCharArray()) {
                if (temp.children[c - 'a'] == null) {
                    temp.children[c - 'a'] = new Node();
                }
                temp = temp.children[c - 'a'];
            }
            temp.word = word;
        }
    }

    /**
     * This class represents each node in the Trie
     */
    static class Node {
        String word;
        Node[] children;

        Node() {
            children = new Node[26];
            word = "";
        }
    }
}
