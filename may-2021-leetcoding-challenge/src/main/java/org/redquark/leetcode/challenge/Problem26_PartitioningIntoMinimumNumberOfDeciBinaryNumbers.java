package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
 * For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 * <p>
 * Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary
 * numbers needed so that they sum up to n.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n.length <= 10^5
 * n consists of only digits.
 * n does not contain any leading zeros and represents a positive integer.
 */
public class Problem26_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        // Max digit in the number
        int max = 0;
        // Loop through the string
        for (char c : n.toCharArray()) {
            max = Math.max(max, c - '0');
            if (max == 9) {
                return max;
            }
        }
        return max;
    }
}
