package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 8
 */
public class Problem16_GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // Resultant list
        List<String> result = new ArrayList<>();
        /// Recursively generate parentheses
        generateParenthesis(result, "", 0, 0, n);
        return result;
    }

    private void generateParenthesis(List<String> result, String s, int open, int close, int n) {
        // Base case
        if (open == n && close == n) {
            result.add(s);
            return;
        }
        // If the number of open parentheses is less than the given n
        if (open < n) {
            generateParenthesis(result, s + "(", open + 1, close, n);
        }
        // If we need more close parentheses to balance
        if (close < open) {
            generateParenthesis(result, s + ")", open, close + 1, n);
        }
    }
}
