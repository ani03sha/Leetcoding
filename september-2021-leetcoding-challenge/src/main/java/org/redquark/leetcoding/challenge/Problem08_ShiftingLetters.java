package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a string s of lowercase English letters and an integer array shifts of the same length.
 * <p>
 * Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
 * <p>
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 * Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
 * <p>
 * Return the final string after all such shifts to s are applied.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 * shifts.length == s.length
 * 0 <= shifts[i] <= 10^9
 */
public class Problem08_ShiftingLetters {

    public String shiftingLetters(String s, int[] shifts) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // StringBuilder to store output
        StringBuilder output = new StringBuilder();
        // Total number of shifts
        int totalShifts = 0;
        for (int shift : shifts) {
            totalShifts = (totalShifts + shift) % 26;
        }
        // Loop through the given string
        for (int i = 0; i < s.length(); i++) {
            // Index of the current character
            int index = s.charAt(i) - 'a';
            // Append the character after shifting
            output.append((char) ((index + totalShifts) % 26 + 97));
            totalShifts = Math.floorMod(totalShifts - shifts[i], 26);
        }
        return output.toString();
    }
}
