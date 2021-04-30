package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given three integers x, y, and bound, return a list of all the powerful integers that have
 * a value less than or equal to bound.
 * <p>
 * An integer is powerful if it can be represented as xi + yj for some integers i >= 0 and j >= 0.
 * <p>
 * You may return the answer in any order. In your answer, each value should occur at most once.
 * <p>
 * Constraints:
 * <p>
 * 1 <= x, y <= 100
 * 0 <= bound <= 106
 */
public class Problem30_PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        // List to store result
        List<Integer> result = new ArrayList<>();
        // Special case 1: The minimum value that can
        // be made by powerful integers is 2.
        if (bound < 2) {
            return result;
        }
        // Special case 2: If both the numbers are one
        // then it is not possible to make sum greater
        // than two.
        if (x == 1 && y == 1) {
            result.add(2);
            return result;
        }
        // Special case 3: If x is one and y is not one
        // then we will only find powers of y and add
        // it to 1 (for x)
        int maxPowerOfY = (int) (Math.log(bound) / Math.log(y));
        if (x == 1) {
            for (int i = 0; i <= maxPowerOfY; i++) {
                int total = (int) (1 + Math.pow(y, i));
                if (!result.contains(total) && total <= bound) {
                    result.add(total);
                }
            }
            return result;
        }
        // Special case 4: If y is one and x is not one
        // then we will only find powers of y and add
        // it to 1 (for y)
        int maxPowerOfX = (int) (Math.log(bound) / Math.log(x));
        if (y == 1) {
            for (int i = 0; i <= maxPowerOfX; i++) {
                int total = (int) (1 + Math.pow(x, i));
                if (!result.contains(total) && total <= bound) {
                    result.add(total);
                }
            }
            return result;
        }
        // If both numbers are not on, we will find
        // different combinations of them
        for (int i = 0; i <= maxPowerOfX; i++) {
            for (int j = 0; j <= maxPowerOfY; j++) {
                int total = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (!result.contains(total) && total <= bound) {
                    result.add(total);
                }
            }
        }
        return result;
    }
}
