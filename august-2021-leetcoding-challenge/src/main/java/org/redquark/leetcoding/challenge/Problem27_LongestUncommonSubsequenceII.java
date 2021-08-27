package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings strs, return the length of the longest uncommon subsequence between them.
 * If the longest uncommon subsequence does not exist, return -1.
 * <p>
 * An uncommon subsequence between an array of strings is a string that is a subsequence of one string but not
 * the others.
 * <p>
 * A subsequence of a string s is a string that can be obtained after deleting any number of characters from s.
 * <p>
 * For example, "abc" is a subsequence of "aebdc" because you can delete the underlined characters in "aebdc" to
 * get "abc". Other subsequences of "aebdc" include "aebdc", "aeb", and "" (empty string).
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 50
 * 1 <= strs[i].length <= 10
 * strs[i] consists of lowercase English letters.
 */
public class Problem27_LongestUncommonSubsequenceII {

    public int findLUSLength(String[] strs) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Maximum length of uncommon subsequence
        int maxLength = -1;
        // Loop through the array for each string
        for (int i = 0; i < strs.length; i++) {
            // Flag to check if subsequence found
            boolean isSubsequence = false;
            // Length of the current string
            int currentLength = strs[i].length();
            // Loop through all the other strings except self
            for (int j = 0; j < strs.length; j++) {
                // If the two strings are subseqences
                if (i != j && isSubsequenceFound(strs[i], strs[j])) {
                    isSubsequence = true;
                    break;
                }
            }
            if (!isSubsequence) {
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    private boolean isSubsequenceFound(String a, String b) {
        // If the two strings are same
        if (a.equals(b)) {
            return true;
        }
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }
}
