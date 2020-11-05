package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We have n chips, where the position of the ith chip is position[i].
 * <p>
 * We need to move all the chips to the same position. In one step, we can change the position of the
 * ith chip from position[i] to:
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
public class Problem05_MinimumCostToMoveChipsToTheSamePosition {

    /**
     * @param position - position of the chip
     * @return minimum cost needed to move all the chips
     */
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
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
