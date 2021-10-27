package org.redquark.leetcoding.challenge;

public class Problem27_SortColors {

    public int[] sortColors(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return null;
        }
        int zeroes = 0;
        int ones = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroes++;
            } else if (num == 1) {
                ones++;
            }
        }
        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }
        for (int i = zeroes; i < ones + zeroes; i++) {
            nums[i] = 1;
        }
        for (int i = ones + zeroes; i < nums.length; i++) {
            nums[i] = 2;
        }
        return nums;
    }
}
