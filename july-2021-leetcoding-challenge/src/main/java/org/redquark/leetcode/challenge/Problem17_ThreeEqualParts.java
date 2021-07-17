package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array arr which consists of only zeros and ones, divide the array into three
 * non-empty parts such that all of these parts represent the same binary value.
 * <p>
 * If it is possible, return any [i, j] with i + 1 < j, such that:
 * <p>
 * arr[0], arr[1], ..., arr[i] is the first part,
 * arr[i + 1], arr[i + 2], ..., arr[j - 1] is the second part, and
 * arr[j], arr[j + 1], ..., arr[arr.length - 1] is the third part.
 * All three parts have equal binary values.
 * If it is not possible, return [-1, -1].
 * <p>
 * Note that the entire part is used when considering what binary value it represents. For example,
 * [1,1,0] represents 6 in decimal, not 3. Also, leading zeros are allowed, so [0,1,1] and [1,1]
 * represent the same value.
 * <p>
 * Constraints:
 * <p>
 * 3 <= arr.length <= 3 * 10^4
 * arr[i] is 0 or 1
 */
public class Problem17_ThreeEqualParts {

    public int[] threeEqualParts(int[] nums) {
        // This array will represent the output
        int[] result = new int[]{-1, -1};
        // Special case
        if (nums == null || nums.length == 0) {
            return result;
        }
        // Find total number of ones in the array
        int sum = Arrays.stream(nums).sum();
        // If the sum is not divisible by three then we cannot partition
        if (sum % 3 != 0) {
            return result;
        }
        // If there are no ones in the array
        if (sum == 0) {
            result[0] = 0;
            result[1] = nums.length - 1;
            return result;
        }
        // Number of ones in each part
        int numberOfOnesInEachPart = sum / 3;
        // Variables to represent index of first one in every part
        int i = -1;
        int j = -1;
        int k = -1;
        // Reset the sum
        sum = 0;
        // Loop through the array
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == 1) {
                sum++;
                if (sum == numberOfOnesInEachPart + 1) {
                    j = l;
                } else if (sum == numberOfOnesInEachPart * 2 + 1) {
                    k = l;
                } else if (sum == 1) {
                    i = l;
                }
            }
        }
        while (k < nums.length) {
            if (nums[k] == nums[i] && nums[k] == nums[j]) {
                i++;
                j++;
                k++;
            } else {
                return result;
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }
}
