package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You have an initial power of P, an initial score of 0, and a bag of tokens where tokens[i] is the value
 * of the ith token (0-indexed).
 * <p>
 * Your goal is to maximize your total score by potentially playing each token in one of two ways:
 * <p>
 * If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power
 * and gaining 1 score.
 * If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and
 * losing 1 score.
 * Each token may be played at most once and in any order. You do not have to play all the tokens.
 * <p>
 * Return the largest possible score you can achieve after playing any number of tokens.
 * <p>
 * Constraints:
 * <p>
 * 0 <= tokens.length <= 1000
 * 0 <= tokens[i], P < 10^4
 */
public class Problem24_BagOfTokens {

    /**
     * @param tokens - array of token values
     * @param P      - power in the starting
     * @return - largest possible score
     */
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int maxPoints = 0;
        int points = 0;
        int i = 0;
        int j = tokens.length - 1;
        while (i <= j) {
            if (P >= tokens[i]) {
                points++;
                P -= tokens[i++];
                maxPoints = Math.max(maxPoints, points);
            } else if (points > 0) {
                points--;
                P += tokens[j--];
            } else {
                return maxPoints;
            }
        }
        return maxPoints;
    }
}
