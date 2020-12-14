package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.
 * <p>
 * A palindrome string is a string that reads the same backward as forward.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 16
 * s contains only lowercase English letters.
 */
public class Problem14_PalindromePartitioning {

    /**
     * @param s - input string
     * @return valid partitioned palindromes
     */
    public List<List<String>> partition(String s) {
        // Resultant string
        List<List<String>> result = new ArrayList<>();
        // Base conditions
        if (s == null || s.isEmpty()) {
            return result;
        }
        // Track each possible partition
        List<String> partition = new ArrayList<>();
        addPalindromes(s, 0, partition, result);
        return result;
    }

    private void addPalindromes(String s, int start, List<String> partition, List<List<String>> result) {
        // Terminating condition
        if (start == s.length()) {
            List<String> temp = new ArrayList<>(partition);
            result.add(temp);
            return;
        }
        for (int i = start + 1; i <= s.length(); i++) {
            String str = s.substring(start, i);
            if (isPalindrome(str)) {
                partition.add(str);
                addPalindromes(s, i, partition, result);
                partition.remove(partition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
