package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We have n chips, where the position of the ith chip is position[i].
 * <p>
 * We need to move all the chips to the same position. In one step, we can change the position of the i-th chip
 * from position[i] to:
 * <p>
 * position[i] + 2 or position[i] - 2 with cost = 0.
 * position[i] + 1 or position[i] - 1 with cost = 1.
 * Return the minimum cost needed to move all the chips to the same position.
 * <p>
 * Constraints:
 * <p>
 * 1 <= position.length <= 100
 * 1 <= position[i] <= 10^9
 */
public class Problem06_MinimumCostToMoveChipsToTheSamePosition {

    public int minCostToMoveChips(int[] position) {
        // Special case
        if (position == null || position.length == 0) {
            return 0;
        }
        int odd = 0;
        int even = 0;
        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}
