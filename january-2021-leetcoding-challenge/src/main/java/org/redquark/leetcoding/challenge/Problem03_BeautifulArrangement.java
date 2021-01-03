package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose you have n integers from 1 to n. We define a beautiful arrangement as an array that is constructed
 * by these n numbers successfully if one of the following is true for the ith position (1 <= i <= n) in this
 * array:
 * <p>
 * - The number at the ith position is divisible by i.
 * - i is divisible by the number at the ith position.
 * <p>
 * Given an integer n, return the number of the beautiful arrangements that you can construct.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 15
 */
public class Problem03_BeautifulArrangement {

    // Number of beautiful arrangements
    private int count = 0;

    /**
     * @param n - given integer
     * @return - number of beautiful arrangements
     */
    public int countArrangement(int n) {
        // Create an array to store the integers
        int[] numbers = new int[n + 1];
        // Put values in that array
        for (int i = 1; i <= n; i++) {
            numbers[i] = i;
        }
        // Perform DFS starting from 1
        dfs(numbers, 1);
        return count;
    }

    private void dfs(int[] numbers, int index) {
        // Base condition
        if (index == numbers.length) {
            count++;
            return;
        }
        // Loop for the remaining elements
        for (int i = index; i < numbers.length; i++) {
            // Check the conditions
            if (numbers[i] % index == 0 || index % numbers[i] == 0) {
                swap(numbers, index, i);
                dfs(numbers, index + 1);
                swap(numbers, i, index);
            }
        }
    }

    private void swap(int[] numbers, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
