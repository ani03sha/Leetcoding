package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses,
 * and so on until the 100th row.  Each glass holds one cup (250ml) of champagne.
 * <p>
 * Then, some champagne is poured in the first glass at the top.  When the topmost glass is full,
 * any excess liquid poured will fall equally to the glass immediately to the left and right of it.
 * <p>
 * When those glasses become full, any excess champagne will fall equally to the left and right of those
 * glasses, and so on.  (A glass at the bottom row has its excess champagne fall on the floor.)
 * <p>
 * For example, after one cup of champagne is poured, the top most glass is full.
 * <p>
 * After two cups of champagne are poured, the two glasses on the second row are half full.
 * <p>
 * After three cups of champagne are poured, those two cups become full - there are 3 full glasses
 * total now.
 * <p>
 * After four cups of champagne are poured, the third row has the middle glass half full, and the
 * two outside glasses are a quarter full, as pictured below.
 * <p>
 * Now after pouring some non-negative integer cups of champagne, return how full the jth glass
 * in the ith row is (both i and j are 0-indexed.)
 * <p>
 * Constraints:
 * <p>
 * 0 <= poured <= 10^9
 * 0 <= query_glass <= query_row < 100
 */
public class Problem26_ChampagneTower {

    /**
     * @param poured      - amount of poured champagne
     * @param query_row   - given row
     * @param query_glass - index of glass in row
     * @return champagne in i,j glass
     */
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] dp = new double[101];
        dp[0] = poured;
        for (int i = 1; i <= query_row; i++) {
            for (int j = i; j >= 0; j--) {
                dp[j + 1] += dp[j] = Math.max(0.0, (dp[j] - 1) / 2.0);
            }
        }
        return Math.min(dp[query_glass], 1.0);
    }
}
