package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * You want to form a target string of lowercase letters.
 * <p>
 * At the beginning, your sequence is target.length '?' marks. You also have a stamp of lowercase letters.
 * <p>
 * On each turn, you may place the stamp over the sequence, and replace every letter in the sequence
 * with the corresponding letter from the stamp. You can make up to 10 * target.length turns.
 * <p>
 * For example, if the initial sequence is "?????", and your stamp is "abc",
 * then you may make "abc??", "?abc?", "??abc" in the first turn.
 * <p>
 * (Note that the stamp must be fully contained in the boundaries of the sequence in order to stamp.)
 * <p>
 * If the sequence is possible to stamp, then return an array of the index of the left-most letter
 * being stamped at each turn. If the sequence is not possible to stamp, return an empty array.
 * <p>
 * For example, if the sequence is "ababc", and the stamp is "abc", then we could return the answer [0, 2],
 * corresponding to the moves "?????" -> "abc??" -> "ababc".
 * <p>
 * Also, if the sequence is possible to stamp, it is guaranteed it is possible to stamp within
 * 10 * target.length moves.
 * <p>
 * Any answers specifying more than this number of moves will not be accepted.
 * <p>
 * Note:
 * <p>
 * 1 <= stamp.length <= target.length <= 1000
 * stamp and target only contain lowercase letters.
 */
public class Problem31_StampingTheSequence {

    public int[] movesToStamp(String stamp, String target) {
        // Stamp character array
        char[] stampArray = stamp.toCharArray();
        // Target character array
        char[] targetArray = target.toCharArray();
        // List to store the indices
        List<Integer> indices = new ArrayList<>();
        // Array to mark if a certain character is visited
        boolean[] visited = new boolean[target.length()];
        // Wildcard count
        int wildcard = 0;
        // Loop through the target string
        while (wildcard < target.length()) {
            // Flag to mark if the replacement is done
            boolean doneReplacement = false;
            // Put stamp on the target
            for (int i = 0; i <= targetArray.length - stampArray.length; i++) {
                if (!visited[i] && canReplace(targetArray, i, stampArray)) {
                    wildcard = doReplace(targetArray, i, stampArray.length, wildcard);
                    doneReplacement = true;
                    visited[i] = true;
                    indices.add(i);
                    if (wildcard == target.length()) {
                        break;
                    }
                }
            }
            if (!doneReplacement) {
                return new int[0];
            }
        }
        // Final result
        int[] finalResult = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            finalResult[i] = indices.get(indices.size() - i - 1);
        }
        return finalResult;
    }

    private int doReplace(char[] targetArray, int index, int length, int wildcardCount) {
        for (int i = 0; i < length; i++) {
            if (targetArray[i + index] != '*') {
                targetArray[i + index] = '*';
                wildcardCount++;
            }
        }
        return wildcardCount;
    }

    private boolean canReplace(char[] targetArray, int index, char[] stampArray) {
        for (int i = 0; i < stampArray.length; i++) {
            if (targetArray[i + index] != '*' && targetArray[i + index] != stampArray[i]) {
                return false;
            }
        }
        return true;
    }
}
