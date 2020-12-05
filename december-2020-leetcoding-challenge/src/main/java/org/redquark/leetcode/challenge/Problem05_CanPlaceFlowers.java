package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
 * and an integer n, return if n new flowers can be planted in the flowerbed without violating the
 * no-adjacent-flowers rule.
 * <p>
 * Constraints:
 * <p>
 * 1 <= flowerbed.length <= 2 * 10^4
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 */
public class Problem05_CanPlaceFlowers {

    /**
     * @param flowerbed - flowerbed with plots
     * @param n         - number of flowers to be planted
     * @return if flowers can be placed
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Base condition
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        int count = 0;
        // Loop through the array
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
