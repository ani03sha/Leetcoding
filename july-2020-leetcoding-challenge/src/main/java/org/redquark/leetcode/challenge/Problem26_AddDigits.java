package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class Problem26_AddDigits {

    /**
     * @param number - input number
     * @return - digital root
     */
    public int addDigits(int number) {
        if (number == 0) {
            return number;
        }
        return number % 9 == 0 ? 9 : number % 9;
    }
}
