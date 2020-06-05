package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex
 * which randomly picks an index in proportion to its weight.
 * <p>
 * Note:
 * <p>
 * 1 <= w.length <= 10000
 * 1 <= w[i] <= 10^5
 * pickIndex will be called at most 10000 times.
 */
public class Problem05_RandomPickWithWeight {

    private final int[] cumulativeSum;
    private int sum;

    public Problem05_RandomPickWithWeight(int[] w) {
        sum = 0;
        cumulativeSum = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            cumulativeSum[i] = sum;
        }
    }

    public int pickIndex() {
        int index = (int) (Math.random() * sum);
        return binarySearch(index + 1);
    }

    private int binarySearch(int value) {
        int left = 0;
        int right = cumulativeSum.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (value > cumulativeSum[middle]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
