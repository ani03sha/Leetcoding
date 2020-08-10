package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 7
 * s consists only of uppercase English letters.
 * s is between "A" and "FXSHRXW".
 */
public class Problem10_ExcelSheetColumnNumber {

    /**
     * @param s - String representing column
     * @return - column in numbers
     */
    public int titleToNumber(String s) {
        int column = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(s.length() - 1 - i) - 'A' + 1;
            column += Math.pow(26, i) * n;
        }
        return column;
    }
}
