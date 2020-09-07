package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a
 * non-empty word in str.
 * <p>
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be
 * separated by a single space.
 */
public class Problem07_WordPattern {

    /**
     * @param pattern -pattern to follow
     * @param s       - string to search
     * @return - true if s follows pattern, false otherwise
     */
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
