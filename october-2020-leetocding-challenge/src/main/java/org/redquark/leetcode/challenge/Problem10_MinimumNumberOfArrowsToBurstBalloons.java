package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 * <p>
 * There are some spherical balloons spread in two-dimensional space. For each balloon,
 * provided input is the start and end coordinates of the horizontal diameter.
 * Since it's horizontal, y-coordinates don't matter, and hence the x-coordinates of start
 * and end of the diameter suffice. The start is always smaller than the end.
 * <p>
 * An arrow can be shot up exactly vertically from different points along the x-axis.
 * A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend.
 * There is no limit to the number of arrows that can be shot. An arrow once shot keeps
 * traveling up infinitely.
 * <p>
 * Given an array points where points[i] = [xstart, xend], return the minimum number of arrows
 * that must be shot to burst all balloons.
 * <p>
 * Constraints:
 * <p>
 * 0 <= points.length <= 10^4
 * points.length == 2
 * -2^31 <= xstart < xend <= 2^31 - 1
 */
public class Problem10_MinimumNumberOfArrowsToBurstBalloons {

    /**
     * @param points - array of start and end coordinates of diameter of balloons
     * @return minimum number of arrows to burst all balloons
     */
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        // Sort the arrays by their ending positions
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrowPosition = points[0][1];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= arrowPosition) {
                continue;
            }
            count++;
            arrowPosition = points[i][1];
        }
        return count;
    }
}
