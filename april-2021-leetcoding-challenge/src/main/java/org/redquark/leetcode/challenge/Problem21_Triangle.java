package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a triangle array, return the minimum path sum from top to bottom.
 * <p>
 * For each step, you may move to an adjacent number of the row below.
 * More formally, if you are on index i on the current row, you may move to either index
 * i or index i + 1 on the next row.
 * <p>
 * Constraints:
 * <p>
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -10^4 <= triangle[i][j] <= 10^4
 * <p>
 * Follow up: Could you do this using only O(n) extra space, where n is the total number of rows
 * in the triangle?
 */
public class Problem21_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        // Lookup table
        int[][] lookup = new int[triangle.size()][triangle.size()];
        // Fill the lookup table
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, -1));
        // Call the recursive helper function
        return minimumTotalHelper(triangle, 0, 0, lookup);
    }

    private int minimumTotalHelper(List<List<Integer>> triangle, int i, int j, int[][] lookup) {
        // Base case - if there is only one row in the triangle
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        // Check in the cache
        if (lookup[i][j] != -1) {
            return lookup[i][j];
        }
        return lookup[i][j] = Math.min(triangle.get(i).get(j) + minimumTotalHelper(triangle, i + 1, j, lookup),
                triangle.get(i).get(j) + minimumTotalHelper(triangle, i + 1, j + 1, lookup));
    }
}
