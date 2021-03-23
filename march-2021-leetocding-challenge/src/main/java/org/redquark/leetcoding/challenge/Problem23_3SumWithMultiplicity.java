package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array arr, and an integer target, return the number of tuples i, j, k
 * such that i < j < k and arr[i] + arr[j] + arr[k] == target.
 * <p>
 * As the answer can be very large, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 3 <= arr.length <= 3000
 * 0 <= arr[i] <= 100
 * 0 <= target <= 300
 */
public class Problem23_3SumWithMultiplicity {

    public int threeSumMulti(int[] arr, int target) {
        // Map to store the frequencies of every element
        // in the array (0 to 100)
        long[] frequencyMap = new long[101];
        // Total number of tuples
        long tuples = 0L;
        // Calculate the frequencies of every element
        for (int a : arr) {
            frequencyMap[a]++;
        }
        // Loop for combinations
        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                // Get the current difference
                int k = target - i - j;
                // Check for boundary conditions
                if (k < j || k > 100 || frequencyMap[i] == 0
                        || frequencyMap[j] == 0 || frequencyMap[k] == 0) {
                    continue;
                }
                // For the duplicates
                if (i == j && j == k) {
                    tuples += (frequencyMap[i]) * (frequencyMap[i] - 1) * (frequencyMap[i] - 2) / 6;
                } else if (i == j) {
                    tuples += frequencyMap[k] * frequencyMap[i] * (frequencyMap[i] - 1) / 2;
                } else if (j == k) {
                    tuples += frequencyMap[i] * frequencyMap[j] * (frequencyMap[j] - 1) / 2;
                } else {
                    tuples += frequencyMap[i] * frequencyMap[j] * frequencyMap[k];
                }
            }
        }
        return (int) (tuples % (1_000_000_007));
    }
}
