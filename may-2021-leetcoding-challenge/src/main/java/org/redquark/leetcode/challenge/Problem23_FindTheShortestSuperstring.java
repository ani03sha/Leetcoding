package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings words, return the smallest string that contains each string in words as a substring.
 * If there are multiple valid strings of the smallest length, return any of them.
 * <p>
 * You may assume that no string in words is a substring of another string in words.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 12
 * 1 <= words[i].length <= 20
 * words[i] consists of lowercase English letters.
 * All the strings of words are unique.
 */
public class Problem23_FindTheShortestSuperstring {

    public String shortestSuperstring(String[] words) {
        // Length of the string
        int n = words.length;
        // Graph to store the length of string to append
        // when words[i] followed by words[j]
        int[][] graph = new int[n][n];
        // Populate the graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = calculateLengthToAppend(words[i], words[j]);
                graph[j][i] = calculateLengthToAppend(words[j], words[i]);
            }
        }
        // Now, this has become the "Travelling Salesman Problem"
        int[][] lookup = new int[1 << n][n];
        int[][] path = new int[1 << n][n];
        int last = -1;
        int min = Integer.MAX_VALUE;
        // Start TSP DP
        for (int i = 1; i < (1 << n); i++) {
            Arrays.fill(lookup[i], Integer.MAX_VALUE);
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    int previous = i - (1 << j);
                    if (previous == 0) {
                        lookup[i][j] = words[j].length();
                    } else {
                        for (int k = 0; k < n; k++) {
                            if (lookup[previous][k] < Integer.MAX_VALUE && lookup[previous][k] + graph[k][j] < lookup[i][j]) {
                                lookup[i][j] = lookup[previous][k] + graph[k][j];
                                path[i][j] = k;
                            }
                        }
                    }
                }
                if (i == (1 << n) - 1 && lookup[i][j] < min) {
                    min = lookup[i][j];
                    last = j;
                }
            }
        }
        // Build the path
        StringBuilder superstring = new StringBuilder();
        int current = (1 << n) - 1;
        Stack<Integer> stack = new Stack<>();
        while (current > 0) {
            stack.push(last);
            int temp = current;
            current -= (1 << last);
            last = path[temp][last];
        }
        // Build the result
        int i = stack.pop();
        superstring.append(words[i]);
        while (!stack.isEmpty()) {
            int j = stack.pop();
            superstring.append(words[j].substring(words[j].length() - graph[i][j]));
            i = j;
        }
        return superstring.toString();
    }

    private int calculateLengthToAppend(String word1, String word2) {
        for (int i = 1; i < word1.length(); i++) {
            if (word2.startsWith(word1.substring(i))) {
                return word2.length() - word1.length() + i;
            }
        }
        return word2.length();
    }
}
