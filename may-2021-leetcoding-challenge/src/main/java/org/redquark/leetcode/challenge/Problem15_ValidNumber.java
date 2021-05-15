package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A valid number can be split up into these components (in order):
 * <p>
 * A decimal number or an integer.
 * (Optional) An 'e' or 'E', followed by an integer.
 * A decimal number can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * One of the following formats:
 * At least one digit, followed by a dot '.'.
 * At least one digit, followed by a dot '.', followed by at least one digit.
 * A dot '.', followed by at least one digit.
 * An integer can be split up into these components (in order):
 * <p>
 * (Optional) A sign character (either '+' or '-').
 * At least one digit.
 * For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].
 * <p>
 * Given a string s, return true if s is a valid number.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 20
 * s consists of only English letters (both uppercase and lowercase), digits (0-9), plus '+', minus '-', or dot '.'.
 */
public class Problem15_ValidNumber {

    public boolean isNumber(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return false;
        }
        // Remove any whitespaces at the end
        s = s.trim();
        // Length of the string
        int n = s.length();
        // Count of signs
        int signCount = 0;
        // Flags for different characters in the string
        boolean hasE = false;
        boolean hasNumber = false;
        boolean hasDecimal = false;
        // Loop through the entire string
        for (int i = 0; i < n; i++) {
            // Current character
            char c = s.charAt(i);
            // If we have found any invalid character
            if (!isInvalidCharacter(c)) {
                return false;
            }
            // If we have a digit, then it is fine
            if (c >= '0' && c <= '9') {
                hasNumber = true;
            }
            // Check for 'e' or 'E'
            if (c == 'e' || c == 'E') {
                // e/E cannot appear twice and it has to
                // be in front of a digit
                if (hasE || !hasNumber) {
                    return false;
                }
                // e/E cannot be at the last character
                if (i == n - 1) {
                    return false;
                }
                hasE = true;
            }
            // Check for decimal
            if (c == '.') {
                // A decimal cannot appear twice and cannot
                // appear after e/E
                if (hasDecimal || hasE) {
                    return false;
                }
                // If a decimal is at the last, then a digit
                // should be present in front of it
                if (i == n - 1 && !hasNumber) {
                    return false;
                }
                hasDecimal = true;
            }
            // Signs (+/-)
            if (c == '+' || c == '-') {
                // There cannot be more than two signs
                if (signCount == 2) {
                    return false;
                }
                // Sign cannot be at the last
                if (i == n - 1) {
                    return false;
                }
                // Sign can appear in middle only if it is
                // in front of e/E
                if (i > 0 && !hasE) {
                    return false;
                }
                // If there is any other character other than e/E before
                // sign in the middle, it is invalid
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
                signCount++;
            }
        }
        return true;
    }

    private boolean isInvalidCharacter(char c) {
        return c == '.' || c == '+' || c == '-' || c == 'e' || c == 'E' || c >= '0' && c <= '9';
    }
}
