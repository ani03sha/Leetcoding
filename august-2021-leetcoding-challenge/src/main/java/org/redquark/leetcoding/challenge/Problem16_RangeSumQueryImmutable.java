package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and
 * right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^5 <= nums[i] <= 10^5
 * 0 <= left <= right < nums.length
 * At most 10^4 calls will be made to sumRange.
 */
public class Problem16_RangeSumQueryImmutable {

    static class NumArray {

        private final Map<Integer, Integer> indexSumMap;

        public NumArray(int[] nums) {
            indexSumMap = new HashMap<>();
            int cumulativeSum = 0;
            for (int i = 0; i < nums.length; i++) {
                cumulativeSum += nums[i];
                indexSumMap.put(i, cumulativeSum);
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return indexSumMap.get(right);
            }
            return indexSumMap.get(right) - indexSumMap.get(left - 1);
        }
    }
}
