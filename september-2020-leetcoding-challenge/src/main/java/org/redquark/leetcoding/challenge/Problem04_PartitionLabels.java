package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * A string S of lowercase English letters is given. We want to partition this string into as many parts as
 * possible so that each letter appears in at most one part, and return a list of integers representing the
 * size of these parts.
 * <p>
 * Note:
 * <p>
 * S will have length in range [1, 500].
 * S will consist of lowercase English letters ('a' to 'z') only.
 */
public class Problem04_PartitionLabels {

    /**
     * @param S - input string
     * @return list of lengths of parts
     */
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<Integer>();
        if (S.length() == 0) {
            return ans;
        }
        char[] arr = S.toCharArray();
        Set<Character> seen = new HashSet<Character>();
        int[] right = new int[26];
        for (char c : arr)
            right[c - 'a']++;
        int count = 0;
        for (char c : arr) {
            count++;
            seen.add(c);
            if (--right[c - 'a'] == 0) {
                seen.remove(c);
                if (seen.isEmpty()) {
                    ans.add(count);
                    count = 0;
                }
            }
        }
        return ans;
    }
}
