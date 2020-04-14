package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
 * <p>
 * direction can be 0 (for left shift) or 1 (for right shift).
 * amount is the amount by which string s is to be shifted.
 * A left shift by 1 means remove the first character of s and append it to the end.
 * Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
 * Return the final string after all operations.
 */
public class Challenge14_PerformStringShifts {

    /**
     * @param s     - input string
     * @param shift - matrix with direction and shift
     * @return - shifted string
     * <p>
     * Algorithm:
     * 1. Since left shift and right shift cancel out each other, we will find the net shift
     * 2. Take modulus of net shift with the length of the string
     * 3. Rotate the string by the net shift
     */
    public String stringShift(String s, int[][] shift) {
        // Net shift (left - right)
        int netShift = 0;
        // Loop through all the elements in the shift matrix
        for (int[] ints : shift) {
            // If shift is left, add the amount to net shift and if it is right shift then add the negative of
            // amount to the net shift
            netShift += ints[0] == 0 ? ints[1] : -ints[1];
        }
        // In case, shift is greater than the length of the string itself, take the modulus
        netShift = netShift % s.length();
        // Rotate left if net shift is positive else rotate right
        return netShift > 0 ? rotateLeft(s, netShift) : rotateRight(s, -netShift);
    }

    /**
     * @param s     - input string
     * @param shift - left shift amount
     * @return - left shifted string
     */
    private String rotateLeft(String s, int shift) {
        s = s.substring(shift) + s.substring(0, shift);
        return s;
    }

    /**
     * @param s     -input string
     * @param shift - right shift amount
     * @return - right shifted string
     */
    private String rotateRight(String s, int shift) {
        return rotateLeft(s, s.length() - shift);
    }
}
