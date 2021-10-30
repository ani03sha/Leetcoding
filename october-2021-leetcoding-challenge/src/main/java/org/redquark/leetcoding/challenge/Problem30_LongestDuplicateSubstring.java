package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, consider all duplicated substrings: (contiguous) substrings of s that occur 2 or more times.
 * The occurrences may overlap.
 * <p>
 * Return any duplicated substring that has the longest possible length. If s does not have a duplicated substring,
 * the answer is "".
 * <p>
 * Constraints:
 * <p>
 * 2 <= s.length <= 3 * 10^4
 * s consists of lowercase English letters.
 */
public class Problem30_LongestDuplicateSubstring {

    public String longestDupSubstring(String S) {
        int low = 0;
        int high = S.length() - 1;
        String[] result = new String[1];
        result[0] = "";
        while (low < high) {
            int middle = low + (high - low) / 2 + 1;
            if (isValid(S, middle, result)) {
                low = middle;
            } else {
                high = middle - 1;
            }
        }
        return result[0];
    }

    private boolean isValid(String S, int len, String[] res) {
        Map<Long, List<Integer>> map = new HashMap<>();
        long hash = 0, Q = 19260817, R = 26, RM = 1;
        for (int i = 0; i < len - 1; i++) {
            RM = RM % Q * R;
        }
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (i >= len) {
                hash = (hash + Q - (S.charAt(i - len) - 'a') * RM % Q) % Q;
            }
            hash = (hash * R + (c - 'a')) % Q;
            if (i < len - 1) continue;
            if (map.containsKey(hash) && check(map.get(hash), i, len, S)) {
                res[0] = S.substring(i + 1 - len, i + 1);
                return true;
            }
            map.putIfAbsent(hash, new ArrayList<>());
            map.get(hash).add(i);
        }
        return false;
    }

    // handle collision
    private boolean check(List<Integer> list, int curr, int len, String S) {
        for (int end : list) {
            int index = curr;
            boolean found = true;
            for (int i = 0; i < len; i++) {
                if (S.charAt(end--) != S.charAt(index--)) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }
}
