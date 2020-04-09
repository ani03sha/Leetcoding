package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 */
public class Challenge09_BackspaceStringCompare {

    /**
     * @param S - first string
     * @param T - second string
     * @return - boolean if both strings are equal after hitting backspace
     * <p>
     * Algorithm:
     * 1. Iterate both strings one by one
     * 2. If the current character is '#' then we delete it and it's previous character, if present
     * 3. After the iteration check if the two strings are equal
     */
    public boolean backspaceCompare(String S, String T) {
        int count = 0;
        // This loop deletes character from the first string
        while (count < S.length()) {
            char c = S.charAt(count);
            if (c == '#') {
                S = deleteCharacter(S, count);
                count = 0;
            } else {
                count++;
            }
        }
        count = 0;
        // This loop deletes character from the second string
        while (count < T.length()) {
            char c = T.charAt(count);
            if (c == '#') {
                T = deleteCharacter(T, count);
                count = 0;
            } else {
                count++;
            }
        }
        return S.equals(T);
    }

    /**
     * @param x - current string
     * @param i - current count
     * @return - remaining string after deleting character if '#' occurred
     */
    private String deleteCharacter(String x, int i) {
        if (i == 0) {
            x = x.substring(i + 1);
        } else if (i == x.length() - 1) {
            x = x.substring(0, i - 1);
        } else {
            x = x.substring(0, i - 1) + x.substring(i + 1);
        }
        return x;
    }
}
