package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * An n-bit gray code sequence is a sequence of 2^n integers where:
 * <p>
 * - Every integer is in the inclusive range [0, 2^n - 1],
 * - The first integer is 0,
 * - An integer appears no more than once in the sequence,
 * - The binary representation of every pair of adjacent integers differs by exactly one bit, and
 * - The binary representation of the first and last integers differs by exactly one bit.
 * <p>
 * Given an integer n, return any valid n-bit gray code sequence.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 16
 */
public class Problem01_GrayCode {

    public List<Integer> grayCode(int n) {
        // Base case
        if (n == 0) {
            List<Integer> codes = new ArrayList<>();
            codes.add(0);
            return codes;
        }
        // List to store gray code
        List<Integer> codes = grayCode(n - 1);
        // Number to add
        int x = 1 << (n - 1);
        // Add it into the list
        for (int i = codes.size() - 1; i >= 0; i--) {
            codes.add(x + codes.get(i));
        }
        return codes;
    }
}
