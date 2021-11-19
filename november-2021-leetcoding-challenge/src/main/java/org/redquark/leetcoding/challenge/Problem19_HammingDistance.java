package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 * <p>
 * Constraints:
 * <p>
 * 0 <= x, y <= 2^31 - 1
 */
public class Problem19_HammingDistance {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            z &= (z - 1);
            count++;
        }
        return count;
    }
}
