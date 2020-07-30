package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * add spaces in s to construct a sentence where each word is a valid dictionary word.
 * Return all such possible sentences.
 * <p>
 * Note:
 * <p>
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 */
public class Problem30_WordBreakII {

    /**
     * @param s        - input string
     * @param wordDict - dictionary of words
     * @return list of sentences
     */
    public List<String> wordBreak(String s, List<String> wordDict) {
        // Base condition
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return Collections.emptyList();
        }
        // DP Map
        Map<String, List<String>> dp = new HashMap<>();
        return wordBreak(s, wordDict, dp);
    }

    private List<String> wordBreak(String s, List<String> wordDict, Map<String, List<String>> dp) {
        // Check if the string is already present
        if (dp.containsKey(s)) {
            return dp.get(s);
        }
        List<String> answer = new ArrayList<>();
        if (wordDict.contains(s)) {
            answer.add(s);
        }
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)) {
                String suffix = s.substring(i);
                List<String> suffixList = wordBreak(suffix, wordDict, dp);
                for (String word : suffixList) {
                    answer.add(prefix + " " + word);
                }
            }
        }
        dp.put(s, answer);
        return answer;
    }
}
