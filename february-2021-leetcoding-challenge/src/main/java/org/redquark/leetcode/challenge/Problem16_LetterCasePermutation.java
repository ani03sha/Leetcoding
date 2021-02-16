package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to
 * create another string.
 * <p>
 * Return a list of all possible strings we could create. You can return the output in any order.
 * <p>
 * Constraints:
 * <p>
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 */
public class Problem16_LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        // List to store the permutations
        List<String> permutations = new ArrayList<>();
        backtrack(S, 0, new StringBuilder(), permutations);
        return permutations;
    }

    private void backtrack(String s, int index, StringBuilder sb, List<String> permutations) {
        // Base condition
        if (index == s.length()) {
            permutations.add(sb.toString());
            return;
        }
        // Current character
        char c = s.charAt(index);
        // If the character is not letter
        if (!Character.isLetter(c)) {
            // Simply append it to the string
            sb.append(c);
            backtrack(s, index + 1, sb, permutations);
            sb.deleteCharAt(sb.length() - 1);
        }
        // If it is a letter
        else {
            sb.append(Character.toLowerCase(c));
            backtrack(s, index + 1, sb, permutations);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(c));
            backtrack(s, index + 1, sb, permutations);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

