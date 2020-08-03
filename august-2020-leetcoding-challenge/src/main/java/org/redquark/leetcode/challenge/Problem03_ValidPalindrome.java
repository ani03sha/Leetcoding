package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Constraints:
 * s consists only of printable ASCII characters.
 */
public class Problem03_ValidPalindrome {

    /**
     * @param s - input string
     * @return true, if the string is palindrome, false, otherwise
     */
    public boolean isPalindrome(String s) {
        // Base condition
        if (s == null || s.equals("")) {
            return true;
        }
        // Filter string
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // Convert string to lowercase
        s = s.toLowerCase();
        // Left and right counter
        int left = 0;
        int right = s.length() - 1;
        // Loop until left does not meet right
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
