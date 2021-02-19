package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s of '(' , ')' and lowercase English characters.
 * <p>
 * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions )
 * so that the resulting parentheses string is valid and return any valid string.
 * <p>
 * Formally, a parentheses string is valid if and only if:
 * <p>
 * It is the empty string, contains only lowercase characters, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s[i] is one of  '(' , ')' and lowercase English letters.
 */
public class Problem19_MinimumRemoveToMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        // String Builder going forward
        StringBuilder forward = new StringBuilder();
        // Count of open parenthesis
        int open = 0;
        // Loop through the string forward
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            forward.append(s.charAt(i));
        }
        // String Builder going backward
        StringBuilder backward = new StringBuilder();
        // Count of closed parenthesis
        int close = 0;
        // Loop through the string backward
        for (int i = forward.length() - 1; i >= 0; i--) {
            if (forward.charAt(i) == ')') {
                close++;
            } else if (forward.charAt(i) == '(') {
                if (close == 0) {
                    continue;
                }
                close--;
            }
            backward.append(forward.charAt(i));
        }
        return backward.reverse().toString();
    }
}
