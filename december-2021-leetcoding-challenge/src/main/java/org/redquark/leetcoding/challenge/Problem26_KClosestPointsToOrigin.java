package org.redquark.leetcoding.challenge;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
 * return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)^2 + (y1 - y2)^2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= points.length <= 10^4
 * -104 < xi, yi < 10^4
 */
public class Problem26_KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int K) {
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
        Collections.addAll(minHeap, points);
        int[][] result = new int[K][2];
        int index = 0;
        while (K > 0) {
            int[] current = minHeap.remove();
            result[index][0] = current[0];
            result[index][1] = current[1];
            K--;
            index++;
        }
        return result;
    }
}
