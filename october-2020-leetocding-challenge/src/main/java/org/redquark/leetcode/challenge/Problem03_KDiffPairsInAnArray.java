package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharmamp
 * <p>
 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
 * <p>
 * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
 * <p>
 * 0 <= i, j < nums.length
 * i != j
 * a <= b
 * b - a == k
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^7 <= nums[i] <= 10^7
 * 0 <= k <= 10^7
 */
public class Problem03_KDiffPairsInAnArray {

    /**
     * @param numbers - input array
     * @param k       - target value
     * @return number of pairs
     */
    public int findPairs(int[] numbers, int k) {
        // Base condition
        if (numbers.length == 0 || k < 0) {
            return 0;
        }
        // Map to store frequency of numbers in the array
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Fill the map
        Arrays.stream(numbers).forEach(n -> frequencies.merge(n, 1, Integer::sum));
        // Unique pairs count
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            int target = key + k;
            if (k == 0 && value > 1) {
                count++;
            } else if (k != 0 && frequencies.containsKey(target)) {
                count++;
            }
        }
        return count;
    }
}
