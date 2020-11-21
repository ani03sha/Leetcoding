package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of digits, you can write numbers using each digits[i] as many times as we want.
 * For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
 * <p>
 * Return the number of positive integers that can be generated that are less than or equal to a
 * given integer n.
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 9
 * digits[i].length == 1
 * digits[i] is a digit from '1' to '9'.
 * All the values in digits are unique.
 * 1 <= n <= 10^9
 */
public class Problem21_NumberAtMostNGivenDigitSet {

    /**
     * @param digits - array of digits
     * @param n      target value
     * @return count of all numbers less than n that can be formed from digits array
     */
    public int atMostNGivenDigitSet(String[] digits, int n) {
        char[] s = String.valueOf(n).toCharArray();
        int length = s.length;
        int count = 0;
        for (int i = 1; i < length; i++) {
            count += Math.pow(digits.length, i);
        }
        for (int i = 0; i < length; i++) {
            boolean prefix = false;
            for (String d : digits) {
                if (d.charAt(0) < s[i]) {
                    count += Math.pow(digits.length, length - i - 1);
                } else if (d.charAt(0) == s[i]) {
                    prefix = true;
                    break;
                }
            }
            if (!prefix) {
                return count;
            }
        }
        return count + 1;
    }
}
