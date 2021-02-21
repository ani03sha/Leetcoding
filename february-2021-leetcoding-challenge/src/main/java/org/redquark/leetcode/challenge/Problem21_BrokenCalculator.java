package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * On a broken calculator that has a number showing on its display, we can perform two operations:
 * <p>
 * Double: Multiply the number on the display by 2, or;
 * Decrement: Subtract 1 from the number on the display.
 * Initially, the calculator is displaying the number X.
 * <p>
 * Return the minimum number of operations needed to display the number Y.
 * <p>
 * Note:
 * <p>
 * 1 <= X <= 10^9
 * 1 <= Y <= 10^9
 */
public class Problem21_BrokenCalculator {

    public int brokenCalc(int X, int Y) {
        int minimumOperations = 0;
        while (Y > X) {
            minimumOperations++;
            Y = Y % 2 == 0 ? Y / 2 : Y + 1;
        }
        return minimumOperations + X - Y;
    }
}
