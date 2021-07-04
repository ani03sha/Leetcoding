package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 * <p>
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * <p>
 * Since the answer may be too large, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2 * 10^4
 */
public class Problem04_CountVowelsPermutation {

    public int countVowelPermutation(int n) {
        // Modulus value
        final int MODULUS = (int) (1e9 + 7);
        // Lookup table to store the number of strings
        // of length i that end at character j
        long[][] lookup = new long[n + 1][5];
        // Base initialization - number of strings
        // of length 1 will have only one character
        for (int i = 0; i < 5; i++) {
            lookup[1][i] = 1;
        }
        // The given constraints are like direct graph
        // with the following adjacency matrix
        int[][] adjacencyMatrix = {
                {1},
                {0, 2},
                {0, 1, 3, 4},
                {2, 4},
                {0}
        };
        // Iterate over the range [1, n)
        for (int i = 1; i < n; i++) {
            // Traverse the direct graph
            for (int j = 0; j < 5; j++) {
                lookup[i + 1][j] = 0;
                // Traversing the adjacency matrix
                for (int vertex : adjacencyMatrix[j]) {
                    lookup[i + 1][j] += lookup[i][vertex] % MODULUS;
                }
            }
        }
        // Total permutations
        long permutations = 0;
        for (int i = 0; i < 5; i++) {
            permutations = (permutations + lookup[n][i]) % MODULUS;
        }
        return (int) permutations;
    }
}
