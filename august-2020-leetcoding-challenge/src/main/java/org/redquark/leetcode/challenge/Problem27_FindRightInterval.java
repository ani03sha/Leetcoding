package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of intervals, for each of the interval i, check if there exists an interval j
 * whose start point is bigger than or equal to the end point of the interval i, which can be
 * called that j is on the "right" of i.
 * <p>
 * For any interval i, you need to store the minimum interval j's index, which means that the
 * interval j has the minimum start point to build the "right" relationship for interval i.
 * <p>
 * If the interval j doesn't exist, store -1 for the interval i.
 * Finally, you need output the stored value of each interval as an array.
 * <p>
 * Note:
 * <p>
 * You may assume the interval's end point is always bigger than its start point.
 * You may assume none of these intervals have the same start point.
 */
public class Problem27_FindRightInterval {

    /**
     * @param intervals - array of intervals
     * @return interval to the right
     */
    public int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        Arrays.fill(result, -1);

        Node[] leftIndex = new Node[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            Node n = new Node();
            n.index = i;
            n.value = intervals[i][0];
            leftIndex[i] = n;
        }
        Arrays.sort(leftIndex);

        for (int i = 0; i < intervals.length; i++) {
            int rightIndex = intervals[i][1];
            int left = 0, right = intervals.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                Node tmp = leftIndex[mid];
                if (tmp.value > rightIndex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (leftIndex[right].value == rightIndex) {
                result[i] = leftIndex[right].index;
            } else if (right < intervals.length - 1) {
                result[i] = leftIndex[right + 1].index;
            }

        }
        return result;
    }

    static class Node implements Comparable<Node> {
        int value;
        int index;

        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }
    }
}
