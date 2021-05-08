package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Let's say a positive integer is a super-palindrome if it is a palindrome, and it is also
 * the square of a palindrome.
 * <p>
 * Given two positive integers left and right represented as strings, return the number of super-palindromes
 * integers in the inclusive range [left, right]
 * <p>
 * Constraints:
 * <p>
 * 1 <= left.length, right.length <= 18
 * left and right consist of only digits.
 * left and right cannot have leading zeros.
 * left and right represent integers in the range [1, 10^18].
 * left is less than or equal to right.
 */
public class Problem08_SuperPalindromes {

    public int superPalindromesInRange(String left, String right) {
        // Left and right ranges in integer
        long leftRange = Long.parseLong(left);
        long rightRange = Long.parseLong(right);
        // Total count of super palindromes
        int count = 0;
        // List to store all palindromes
        List<Long> palindromes = new ArrayList<>();
        // Add all numbers from 1 to 9 in the list
        for (long i = 1; i <= 9; i++) {
            palindromes.add(i);
        }
        // Create palindromic strings
        for (long i = 1; i <= 10000; i++) {
            // Left part
            String L = Long.toString(i);
            // Right part
            String R = new StringBuilder(L).reverse().toString();
            palindromes.add(Long.parseLong(L + R));
            // Add palindromes with middle number
            for (long d = 0; d < 10; d++) {
                palindromes.add(Long.parseLong(L + d + R));
            }
        }
        // Now check for all palindromes in the list
        for (long palindrome : palindromes) {
            // Square of the palindrome
            long square = palindrome * palindrome;
            if (leftRange <= square && square <= rightRange && isPalindrome(square)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(long n) {
        long x = n;
        long sum = 0;
        while (x > 0) {
            long remainder = x % 10;
            sum = (sum * 10) + remainder;
            x /= 10;
        }
        return sum == n;
    }
}
