package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two sequences pushed and popped with distinct values, return true if and only if this
 * could have been the result of a sequence of push and pop operations on an initially empty stack.
 * <p>
 * Constraints:
 * <p>
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed is a permutation of popped.
 * pushed and popped have distinct values.
 */
public class Problem26_ValidStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Length of the pushed array
        int n = pushed.length;
        // Index to iterate through the pushed array
        int i = 0;
        // Index to iterate through the popped array
        int j = 0;
        // Index that represents the stack's top
        int s = 0;
        // Loop for the pushed array
        while (i < n) {
            // Check if the top of stack is
            // equal to the current element
            // in the popped array
            if (s >= 0 && pushed[s] == popped[j]) {
                j++;
                s--;
            } else {
                s++;
                i++;
                // Update the top
                if (i < n) {
                    pushed[s] = pushed[i];
                }
            }
        }
        return s == 0;
    }
}
