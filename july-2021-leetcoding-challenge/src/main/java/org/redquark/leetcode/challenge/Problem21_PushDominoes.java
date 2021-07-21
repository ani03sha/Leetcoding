package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There are n dominoes in a line, and we place each domino vertically upright. In the beginning,
 * we simultaneously push some of the dominoes either to the left or to the right.
 * <p>
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left.
 * Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * <p>
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * <p>
 * For the purposes of this question, we will consider that a falling domino expends no additional force
 * to a falling or already fallen domino.
 * <p>
 * You are given a string dominoes representing the initial state where:
 * <p>
 * dominoes[i] = 'L', if the ith domino has been pushed to the left,
 * dominoes[i] = 'R', if the ith domino has been pushed to the right, and
 * dominoes[i] = '.', if the ith domino has not been pushed.
 * Return a string representing the final state.
 * <p>
 * Constraints:
 * <p>
 * n == dominoes.length
 * 1 <= n <= 10^5
 * dominoes[i] is either 'L', 'R', or '.'.
 */
public class Problem21_PushDominoes {

    public String pushDominoes(String dominoes) {
        // Special case
        if (dominoes == null || dominoes.isEmpty()) {
            return dominoes;
        }
        // Length of the string
        int n = dominoes.length();
        // Character representation of string representing dominoes
        char[] dominoCharacters = dominoes.toCharArray();
        // Array to store the force exerted on each domino
        int[] forces = new int[n];
        // Variable to calculate the force
        int force = 0;
        // Loop through the array from left to right
        for (int i = 0; i < n; i++) {
            if (dominoCharacters[i] == 'R') {
                force = n;
            } else if (dominoCharacters[i] == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }
        // Loop through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (dominoCharacters[i] == 'L') {
                force = n;
            } else if (dominoCharacters[i] == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }
        // To represent the final state
        StringBuilder finalState = new StringBuilder();
        // Loop through the force array
        for (int f : forces) {
            if (f > 0) {
                finalState.append('R');
            } else if (f < 0) {
                finalState.append('L');
            } else {
                finalState.append('.');
            }
        }
        return finalState.toString();
    }
}
