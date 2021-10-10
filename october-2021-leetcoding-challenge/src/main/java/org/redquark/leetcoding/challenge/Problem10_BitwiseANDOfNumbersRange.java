package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
 * <p>
 * Constraints:
 * <p>
 * 0 <= left <= right <= 2^31 - 1
 */
public class Problem10_BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right &= right - 1;
        }
        return left & right;
    }
}
