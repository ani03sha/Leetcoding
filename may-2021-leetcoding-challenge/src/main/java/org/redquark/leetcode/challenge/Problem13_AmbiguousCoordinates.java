package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)".
 * Then, we removed all commas, decimal points, and spaces, and ended up with the string s.
 * Return a list of strings representing all possibilities for what our original coordinates could have been.
 * <p>
 * Our original representation never had extraneous zeroes, so we never started with numbers
 * like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other number that can be represented with less digits.
 * <p>
 * Also, a decimal point within a number never occurs without at least one digit occuring before it,
 * so we never started with numbers like ".1".
 * <p>
 * The final answer list can be returned in any order.  Also note that all coordinates in the final answer
 * have exactly one space between them (occurring after the comma.)
 * <p>
 * Note:
 * <p>
 * 4 <= s.length <= 12.
 * s[0] = "(", s[s.length - 1] = ")", and the other elements in s are digits.
 */
public class Problem13_AmbiguousCoordinates {

    public List<String> ambiguousCoordinates(String s) {
        // First we will have to remove the opening and closing parentheses
        s = s.substring(1, s.length() - 1);
        // List to store the final coordinates
        List<String> coordinates = new ArrayList<>();
        // Loop for every combination of the string
        for (int i = 1; i < s.length(); i++) {
            // Find left and right substrings
            String leftSubstring = s.substring(0, i);
            String rightSubstring = s.substring(i);
            // Get the left parts and right parts
            Set<String> leftParts = getParts(leftSubstring);
            Set<String> rightParts = getParts(rightSubstring);
            // Pair the parts
            for (String left : leftParts) {
                for (String right : rightParts) {
                    coordinates.add("(" + left + ", " + right + ")");
                }
            }
        }
        return coordinates;
    }

    private Set<String> getParts(String s) {
        // Length of the string
        int n = s.length();
        // Set to store the possible parts
        Set<String> parts = new HashSet<>();
        // Convert the string in character array for convenient calculations
        char[] characters = s.toCharArray();
        if (characters[0] == '0' && characters[n - 1] == '0') {
            if (n == 1) {
                parts.add("0");
            }
            return parts;
        }
        if (characters[0] == '0') {
            parts.add("0." + s.substring(1));
            return parts;
        }
        if (characters[n - 1] == '0') {
            parts.add(s);
            return parts;
        }
        for (int i = 1; i < n; i++) {
            parts.add(s.substring(0, i) + "." + s.substring(i));
        }
        parts.add(s);
        return parts;
    }
}
