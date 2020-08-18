package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Return all non-negative integers of length N such that the absolute difference between every two consecutive
 * digits is K.
 * <p>
 * Note that every number in the answer must not have leading zeros except for the number 0 itself.
 * For example, 01 has one leading zero and is invalid, but 0 is valid.
 * <p>
 * You may return the answer in any order.
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 9
 * 0 <= K <= 9
 */
public class Problem18_NumbersWithSameConsecutiveDifferences {

    /**
     * @param N- number of digits in a number
     * @param K  - difference between consecutive digits
     * @return - array of all such numbers which satisfy the condition
     */
    public int[] numbersSameConsecutiveDifference(int N, int K) {
        // Queue to store the significant digits
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        // Base condition
        if (N == 1) {
            queue.offer(0);
        }
        while (N-- > 1) {
            for (int i = queue.size(); i > 0; --i) {
                int currentNumber = queue.poll();
                int firstDigit = currentNumber % 10 - K;
                int secondDigit = currentNumber % 10 + K;
                if (firstDigit >= 0) {
                    queue.offer(currentNumber * 10 + firstDigit);
                }
                if (secondDigit < 10 && firstDigit != secondDigit) {
                    queue.offer(currentNumber * 10 + secondDigit);
                }
            }
        }
        return queue.stream().mapToInt(i -> i).toArray();
    }
}
