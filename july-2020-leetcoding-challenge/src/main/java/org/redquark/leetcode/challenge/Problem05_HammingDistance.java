package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are
 * different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 2^31.
 */
public class Problem05_HammingDistance {

    /**
     * @param x - first integer
     * @param y - second integer
     * @return Hamming distance
     */
    public int hammingDistance(int x, int y) {
        int counter = 0;
        String z = Integer.toBinaryString(x ^ y);
        for (char c : z.toCharArray()) {
            if (c == '1') {
                counter++;
            }
        }
        return counter;
    }
}
