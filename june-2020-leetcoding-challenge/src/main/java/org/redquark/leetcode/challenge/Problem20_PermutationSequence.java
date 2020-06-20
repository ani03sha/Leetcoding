package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 * <p>
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * <p>
 * Note:
 * <p>
 * Given n will be between 1 and 9 inclusive.
 * Given k will be between 1 and n! inclusive.
 */
public class Problem20_PermutationSequence {

    /**
     * @param n - set of numbers
     * @param k - Kth permutation needs to be found
     * @return Kth permutation
     */
    public String getPermutation(int n, int k) {
        // Base condition
        if (n <= 0 || k <= 0) {
            return "";
        }
        // List of integers
        List<Integer> numbers = new ArrayList<>(n);
        // Add all elements to the list
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        // Find the factorial of numbers - to find number of sequences that can be generated
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        // Decrement k by 1
        k--;
        // StringBuilder instance that will store the final kth permutation
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            factorial /= (n - i);
            int index = k / factorial;
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial;
        }
        return result.toString();
    }
}
