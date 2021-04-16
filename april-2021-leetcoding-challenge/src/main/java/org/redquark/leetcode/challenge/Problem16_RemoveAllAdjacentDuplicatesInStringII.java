package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s
 * and removing them causing the left and the right side of the deleted substring to concatenate together.
 * <p>
 * We repeatedly make k duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made.
 * <p>
 * It is guaranteed that the answer is unique.
 * <p>
 * Constraints:
 * <p>
 * - 1 <= s.length <= 10^5
 * - 2 <= k <= 10^4
 * - s only contains lower case English letters.
 */
public class Problem16_RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {
        // StringBuilder reference for s
        StringBuilder sb = new StringBuilder(s);
        // Array to store count of the characters
        int[] frequencyMap = new int[sb.length()];
        // Loop through the string
        for (int i = 0; i < sb.length(); i++) {
            // If the adjacent characters are unequal
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                frequencyMap[i] = 1;
            } else {
                // Since the characters are are equal, we will
                // increase the count at i-th position
                frequencyMap[i] = frequencyMap[i - 1] + 1;
                // If the count is equal to k then we will delete
                if (frequencyMap[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i -= k;
                }
            }
        }
        return sb.toString();
    }
}
