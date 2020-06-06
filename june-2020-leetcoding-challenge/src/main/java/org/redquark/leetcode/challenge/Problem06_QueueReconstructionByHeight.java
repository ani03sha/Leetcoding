package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers
 * (h, k), where h is the height of the person and k is the number of people in front of this person who have
 * a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 * <p>
 * Note:
 * The number of people is less than 1,100.
 */
public class Problem06_QueueReconstructionByHeight {

    /**
     * @param people - random list of people
     * @return - restructured queue
     */
    public int[][] reconstructQueue(int[][] people) {
        // Sort the subarray for tallest people
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            } else {
                return a[1] - b[1];
            }
        });
        // Temporary list to add people
        List<int[]> temp = new ArrayList<>();
        for (int[] person : people) {
            temp.add(person[1], person);
        }
        // Resultant queue
        int[][] result = new int[people.length][2];
        for (int i = 0; i < temp.size(); i++) {
            result[i][0] = temp.get(i)[0];
            result[i][1] = temp.get(i)[1];
        }
        return result;
    }
}
