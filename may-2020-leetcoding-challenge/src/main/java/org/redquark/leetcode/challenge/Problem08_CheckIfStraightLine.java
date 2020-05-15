package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * <p>
 * Constraints:
 * <p>
 * 2 <= coordinates.length <= 1000
 * coordinates[i].length == 2
 * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 * coordinates contains no duplicate point.
 */
public class Problem08_CheckIfStraightLine {

    /**
     * @param coordinates - input array of coordinates
     * @return true, if the points are collinear
     * <p>
     * Algorithm:
     * 1. Find the slope of all the points with respect to the first point
     * 2. If the current slope is not equal, the return false
     */
    public boolean checkStraightLine(int[][] coordinates) {
        // Get the coordinates of the first two points
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        // Get the differences of the two points
        int dx = x1 - x0;
        int dy = y1 - y0;

        // Loop for all the coordinates
        for (int[] point : coordinates) {
            int x = point[0];
            int y = point[1];
            if (dx * (y - y1) != dy * (x - x1)) {
                return false;
            }
        }
        return true;
    }
}
