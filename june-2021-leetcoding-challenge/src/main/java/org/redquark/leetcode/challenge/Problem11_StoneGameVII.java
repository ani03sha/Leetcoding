package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Alice and Bob take turns playing a game, with Alice starting first.
 * <p>
 * There are n stones arranged in a row. On each player's turn, they can remove either the leftmost stone
 * or the rightmost stone from the row and receive points equal to the sum of the remaining stones' values in the row. The winner is the one with the higher score when there are no stones left to remove.
 * <p>
 * Bob found that he will always lose this game (poor Bob, he always loses), so he decided to minimize the score's difference.
 * Alice's goal is to maximize the difference in the score.
 * <p>
 * Given an array of integers stones where stones[i] represents the value of the ith stone from the left,
 * return the difference in Alice and Bob's score if they both play optimally.
 * <p>
 * Constraints:
 * <p>
 * n == stones.length
 * 2 <= n <= 1000
 * 1 <= stones[i] <= 1000
 */
public class Problem11_StoneGameVII {

    public int stoneGameVII(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Length of the array
        int n = stones.length;
        // Lookup table to store the intermediate results
        int[][] lookup = new int[n][n];
        // Fill this array with the default values
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, -1));
        // Sum of all the elements
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        return helper(0, n - 1, stones, sum, lookup);
    }

    private int helper(int start, int end, int[] stones, int sum, int[][] lookup) {
        // Base coses
        if (start == end) {
            return 0;
        }
        if (end - start == 1) {
            return Math.max(stones[start], stones[end]);
        }
        if (lookup[start][end] != -1) {
            return lookup[start][end];
        }
        return lookup[start][end] = Math.max(sum - stones[start] - helper(start + 1, end, stones, sum - stones[start], lookup),
                sum - stones[end] - helper(start, end - 1, stones, sum - stones[end], lookup));
    }
}
