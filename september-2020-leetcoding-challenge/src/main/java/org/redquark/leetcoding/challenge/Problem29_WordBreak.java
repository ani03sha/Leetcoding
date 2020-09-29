package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note:
 * <p>
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 */
public class Problem29_WordBreak {

    private static boolean wordBreak(String s, List<String> wordDict, int start, int max, Map<Integer, Boolean> dp) {
        if (start == s.length()) {
            return true;
        }
        if (dp.containsKey(start)) {
            return dp.get(start);
        }
        for (int i = start; i < start + max && i < s.length(); i++) {
            String newWord = s.substring(start, i + 1);
            if (!wordDict.contains(newWord)) {
                continue;
            }
            if (wordBreak(s, wordDict, i + 1, max, dp)) {
                dp.put(start, true);
                return true;
            }
        }
        dp.put(start, false);
        return false;
    }

    /**
     * @param s        - input string which needs to be segmented
     * @param wordDict - dictionary containing the words to be checked in s
     * @return - true if segmentation is possible, false otherwise
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        // DP Map
        Map<Integer, Boolean> dp = new HashMap<>();
        int max = 0;
        for (String word : wordDict) {
            max = Math.max(max, word.length());
        }
        return wordBreak(s, wordDict, 0, max, dp);
    }
}
