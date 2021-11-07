package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
 * also represented as a string.
 * <p>
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class Problem07_MultiplyStrings {

    public String multiply(String num1, String num2) {
        // Special case
        if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        // StringBuilder to store the output
        StringBuilder product = new StringBuilder();
        // Lengths of the string
        int m = num1.length();
        int n = num2.length();
        // Array to store the position of the output
        int[] position = new int[m + n];
        // Multiply using the same process we learned in school
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int p = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int s = p + position[p2];
                position[p1] += s / 10;
                position[p2] = s % 10;
            }
        }
        // Loop for position array
        for (int p : position) {
            if (!(product.length() == 0 && p == 0)) {
                product.append(p);
            }
        }
        return product.length() == 0 ? "0" : product.toString();
    }
}
