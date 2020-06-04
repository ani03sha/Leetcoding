package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 * extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 */
public class Problem04_ReverseString {

    /**
     * @param s - string to be reversed in the form of character array
     * @return reversed string in the form of character array
     */
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
