package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given several boxes with different colors represented by different positive numbers.
 * <p>
 * You may experience several rounds to remove boxes until there is no box left. Each time you
 * can choose some continuous boxes with the same color (i.e., composed of k boxes, k >= 1),
 * remove them and get k * k points.
 * <p>
 * Return the maximum points you can get.
 * <p>
 * Constraints:
 * <p>
 * 1 <= boxes.length <= 100
 * 1 <= boxes[i] <= 100
 */
public class Problem14_RemoveBoxes {

    public int removeBoxes(int[] boxes) {
        // Special case
        if (boxes == null || boxes.length == 0) {
            return 0;
        }
        // Length of the array
        int n = boxes.length;
        // Create a 3D look-up table
        int[][][] lookup = new int[n][n][n];
        return helper(lookup, boxes, 0, n - 1, 1);
    }

    private int helper(int[][][] lookup, int[] boxes, int start, int end, int score) {
        // Base case
        if (start > end) {
            return 0;
        } else if (start == end) {
            return score * score;
        } else if (lookup[start][end][score] != 0) {
            return lookup[start][end][score];
        } else {
            int temp = helper(lookup, boxes, start + 1, end, 1) + score * score;
            for (int i = start + 1; i <= end; i++) {
                if (boxes[start] == boxes[i]) {
                    temp = Math.max(temp, helper(lookup,
                            boxes, start + 1, i - 1, 1) + helper(lookup, boxes, i, end, score + 1));
                }
            }
            return lookup[start][end][score] = temp;
        }
    }
}
