package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the coordinates of four points in 2D space, return whether the four points could construct
 * a square.
 * <p>
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 * <p>
 * Note:
 * <p>
 * - All the input integers are in the range [-10000, 10000].
 * - A valid square has four equal sides with positive length and four equal angles
 * (90-degree angles).
 * - Input points have no order.
 */
public class Problem11_ValidSquare {

    /**
     * @param p1 - first coordinate
     * @param p2 - second coordinate
     * @param p3 - third coordinate
     * @param p4 - fourth coordinate
     * @return true, if valid square, false otherwise
     */
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>(
                Arrays.asList(
                        squareDistanceBetweenTwoPoints(p1, p2),
                        squareDistanceBetweenTwoPoints(p1, p3),
                        squareDistanceBetweenTwoPoints(p1, p4),
                        squareDistanceBetweenTwoPoints(p2, p3),
                        squareDistanceBetweenTwoPoints(p2, p4),
                        squareDistanceBetweenTwoPoints(p3, p4)
                )
        );
        return !set.contains(0) && set.size() == 2;
    }

    private int squareDistanceBetweenTwoPoints(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }
}
