package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * An encoded string S is given.  To find and write the decoded string to a tape, the encoded string is read one
 * character at a time and the following steps are taken:
 * <p>
 * - If the character read is a letter, that letter is written onto the tape.
 * - If the character read is a digit (say d), the entire current tape is repeatedly written
 * d-1 more times in total.
 * - Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed)
 * in the decoded string.
 * <p>
 * Constraints:
 * <p>
 * 2 <= S.length <= 100
 * S will only contain lowercase letters and digits 2 through 9.
 * S starts with a letter.
 * 1 <= K <= 10^9
 * It's guaranteed that K is less than or equal to the length of the decoded string.
 * The decoded string is guaranteed to have less than 2^63 letters.
 */
public class Problem20_DecodedStringAtIndex {

    public String decodeAtIndex(String S, int K) {
        // Size of the decoded string
        long size = 0;
        for (char c : S.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size += 1;
            }
        }
        // Get the kth letter
        for (int i = S.length() - 1; i >= 0; i--) {
            K %= size;
            if (K == 0 && Character.isAlphabetic(S.charAt(i))) {
                return "" + S.charAt(i);
            }
            if (Character.isDigit(S.charAt(i))) {
                size /= (S.charAt(i) - '0');
            } else {
                size -= 1;
            }
        }
        return null;
    }
}


