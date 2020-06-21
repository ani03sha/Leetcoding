package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The demons had captured the princess (P) and imprisoned her in the bottom-right corner of a dungeon.
 * The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (K) was initially positioned
 * in the top-left room and must fight his way through the dungeon to rescue the princess.
 * <p>
 * The knight has an initial health point represented by a positive integer. If at any point his health point
 * drops to 0 or below, he dies immediately.
 * <p>
 * Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms;
 * other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).
 * <p>
 * In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward
 * in each step.
 * <p>
 * Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.
 * <p>
 * Note:
 * <p>
 * The knight's health has no upper bound.
 * Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the
 * princess is imprisoned.
 */
public class Problem21_DungeonGame {

    /**
     * @param dungeon - input array containing dungeons health values
     * @return minimum health needed for the knight to save princess
     */
    public int calculateMinimumHP(int[][] dungeon) {
        // Rows and columns
        int rows = dungeon.length;
        int columns = dungeon[0].length;
        // DP matrix
        int[][] dp = new int[rows][columns];
        // For the bottom right value
        dp[rows - 1][columns - 1] = dungeon[rows - 1][columns - 1] > 0 ? 1 : 1 - dungeon[rows - 1][columns - 1];
        // Loop for the remaining bottom most and right most cells
        for (int i = rows - 2; i >= 0; i--) {
            dp[i][columns - 1] = Math.max(1, dp[i + 1][columns - 1] - dungeon[i][columns - 1]);
        }
        for (int j = columns - 2; j >= 0; j--) {
            dp[rows - 1][j] = Math.max(1, dp[rows - 1][j + 1] - dungeon[rows - 1][j]);
        }
        // Loop for remaining cells
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = columns - 2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}