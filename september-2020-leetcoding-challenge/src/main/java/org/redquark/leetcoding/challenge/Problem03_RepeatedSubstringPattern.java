package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple
 * copies of the substring together. You may assume the given string consists of lowercase English letters only
 * and its length will not exceed 10000.
 */
public class Problem03_RepeatedSubstringPattern {

    /**
     * @param s - input string
     * @return true, if the string can be made from a specific substring, false, otherwise
     */
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                sb.append(subS.repeat(m));
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
