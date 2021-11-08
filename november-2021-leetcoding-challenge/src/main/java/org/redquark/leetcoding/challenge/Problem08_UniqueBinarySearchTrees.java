package org.redquark.leetcoding.challenge;

public class Problem08_UniqueBinarySearchTrees {

    public int numTrees(int n) {
        // Special cases
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // Lookup table to store the number of unique BSTs for a particular i
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = 1;
        // Populate the table for remaining positions
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                lookup[i] += lookup[j] * lookup[i - j - 1];
            }
        }
        return lookup[n];
    }
}
