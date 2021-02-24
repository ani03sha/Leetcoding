package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a balanced parentheses string S, compute the score of the string based on the following rule:
 * <p>
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 * <p>
 * Note:
 * <p>
 * S is a balanced parentheses string, containing only ( and ).
 * 2 <= S.length <= 50
 */
public class Problem24_ScoreOfParentheses {

    public int scoreOfParentheses(String S) {
        // Stack to store the intermediate scores
        Stack<Integer> intermediateScores = new Stack<>();
        // Final score
        int score = 0;
        // Loop for each character in the string
        for (char c : S.toCharArray()) {
            // Check if the current character is the opening parenthesis
            if (c == '(') {
                intermediateScores.push(score);
                score = 0;
            }
            // If the current character is the closing parenthesis
            else {
                score = intermediateScores.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
}
