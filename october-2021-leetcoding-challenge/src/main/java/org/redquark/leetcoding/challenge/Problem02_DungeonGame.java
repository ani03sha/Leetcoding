package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon.
 * The dungeon consists of m x n rooms laid out in a 2D grid. Our valiant knight was initially positioned
 * in the top-left room and must fight his way through dungeon to rescue the princess.
 * <p>
 * The knight has an initial health point represented by a positive integer. If at any point his health point
 * drops to 0 or below, he dies immediately.
 * <p>
 * Some of the rooms are guarded by demons (represented by negative integers), so the knight loses health upon
 * entering these rooms; other rooms are either empty (represented as 0) or contain magic orbs that increase
 * the knight's health (represented by positive integers).
 * <p>
 * To reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.
 * <p>
 * Return the knight's minimum initial health so that he can rescue the princess.
 * <p>
 * Note that any room can contain threats or power-ups, even the first room the knight enters and the
 * bottom-right room where the princess is imprisoned.
 * <p>
 * Constraints:
 * <p>
 * m == dungeon.length
 * n == dungeon[i].length
 * 1 <= m, n <= 200
 * -1000 <= dungeon[i][j] <= 1000
 */
public class Problem02_DungeonGame {

    public int calculateMinimumHP(int[][] dungeon) {
        // Special case
        if (dungeon == null || dungeon.length == 0) {
            return 1;
        }
        // Dimensions of the dungeon
        int m = dungeon.length;
        int n = dungeon[0].length;
        // Lookup table to store the minimum health points
        // required for reaching at cell [i, j]
        int[][] lookup = new int[m][n];
        // Base initialization for the last cell
        lookup[m - 1][n - 1] = dungeon[m - 1][n - 1] > 0 ? 1 : 1 - dungeon[m - 1][n - 1];
        // Solve for the last column
        for (int i = m - 2; i >= 0; i--) {
            lookup[i][n - 1] = Math.max(lookup[i + 1][n - 1] - dungeon[i][n - 1], 1);
        }
        // Solve for the last row
        for (int j = n - 2; j >= 0; j--) {
            lookup[m - 1][j] = Math.max(lookup[m - 1][j + 1] - dungeon[m - 1][j], 1);
        }
        // Solve for remaining cells
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                lookup[i][j] = Math.max(1, Math.min(lookup[i + 1][j], lookup[i][j + 1]) - dungeon[i][j]);
            }
        }
        return lookup[0][0];
    }
}
