package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly
 * k coins.
 * <p>
 * Given n, find the total number of full staircase rows that can be formed.
 * <p>
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class Problem01_ArrangingCoins {

    /**
     * @param n - total number of coins
     * @return number of stairs that can be constructed
     */
    public int arrangeCoins(int n) {
        double root = (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
        return (int) root;
    }
}
