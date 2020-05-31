package org.redquark.leetcode.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
 * <p>
 * (Here, the distance between two points on a plane is the Euclidean distance.)
 * <p>
 * You may return the answer in any order.  The answer is guaranteed to be unique
 * (except for the order that it is in.)
 * <p>
 * Note:
 * <p>
 * 1 <= K <= points.length <= 10000
 * -10000 < points[i][0] < 10000
 * -10000 < points[i][1] < 10000
 */
public class Problem30_KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int K) {
        // Max Heap
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) ->
                (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        // Loop for each point
        for (int[] point : points) {
            // Add the point to the max heap
            maxHeap.add(point);
            if (maxHeap.size() > K) {
                maxHeap.remove();
            }
        }
        int[][] result = new int[K][2];
        while (K-- > 0) {
            result[K] = maxHeap.remove();
        }
        return result;
    }
}
