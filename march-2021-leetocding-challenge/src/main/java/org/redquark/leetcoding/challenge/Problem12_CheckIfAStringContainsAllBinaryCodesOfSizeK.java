package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary string s and an integer k.
 * <p>
 * Return True if every binary code of length k is a substring of s. Otherwise, return False.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^5
 * s consists of 0's and 1's only.
 * 1 <= k <= 20
 */
public class Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK {

    public boolean hasAllCodes(String s, int k) {
        Set<String> distinctSubstrings = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            distinctSubstrings.add(s.substring(i, i + k));
        }
        return distinctSubstrings.size() >= Math.pow(2, k);
    }
}
