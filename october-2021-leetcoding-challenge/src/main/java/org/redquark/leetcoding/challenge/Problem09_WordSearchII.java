package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * <p>
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally
 * or vertically neighboring. The same letter cell may not be used more than once in a word.
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 12
 * board[i][j] is a lowercase English letter.
 * 1 <= words.length <= 3 * 10^4
 * 1 <= words[i].length <= 10
 * words[i] consists of lowercase English letters.
 * All the strings of words are unique.
 */
public class Problem09_WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        // Special case
        if (board == null || board.length == 0 || words == null || words.length == 0) {
            return Collections.emptyList();
        }
        // Rows and columns of the board
        int rows = board.length;
        int columns = board[0].length;
        // Array to mark the visited cells
        boolean[][] visited = new boolean[rows][columns];
        // Create a new reference of Trie
        Trie trie = new Trie();
        // Add all the words in the Trie
        for (String word : words) {
            trie.insert(word);
        }
        // Set to store the final output
        Set<String> output = new HashSet<>();
        // Loop through every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dfs(board, i, j, output, visited, trie, "");
            }
        }
        return new ArrayList<>(output);
    }

    private void dfs(char[][] board, int i, int j, Set<String> output, boolean[][] visited, Trie node, String word) {
        // If the indices are out of bounds or we have visited the cell already
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) {
            return;
        }
        // Get the character at the current board cell
        char c = board[i][j];
        // If this character is not present in the Trie, then we can skip it
        if (node.children[c - 'a'] == null) {
            return;
        }
        // Mark the current cell as visited
        visited[i][j] = true;
        // Move the node to its child
        node = node.children[c - 'a'];
        // Append the current character to the string builder
        word += c;
        // If the word is found
        if (node.isLeaf) {
            output.add(word);
        }
        // Perform DFS in the neighbors of the current node
        dfs(board, i + 1, j, output, visited, node, word);
        dfs(board, i, j + 1, output, visited, node, word);
        dfs(board, i - 1, j, output, visited, node, word);
        dfs(board, i, j - 1, output, visited, node, word);
        // If the word is not found, mark the current cell as unvisited
        visited[i][j] = false;
    }

    static class Trie {
        // Children of the current node
        Trie[] children;
        // Flag to indicate if the current node is
        // the leaf node in the word
        boolean isLeaf;

        Trie() {
            children = new Trie[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        void insert(String word) {
            // Current will point to the root node
            Trie current = this;
            // Loop for every character in the word
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new Trie();
                }
                current = current.children[c - 'a'];
            }
            // Mark the end of the word
            current.isLeaf = true;
        }
    }
}
