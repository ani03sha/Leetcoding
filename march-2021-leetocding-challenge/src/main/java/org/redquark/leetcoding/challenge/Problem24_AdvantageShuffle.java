package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two arrays A and B of equal size, the advantage of A with respect to B
 * is the number of indices i for which A[i] > B[i].
 * <p>
 * Return any permutation of A that maximizes its advantage with respect to B.
 * <p>
 * Note:
 * <p>
 * 1 <= A.length = B.length <= 10000
 * 0 <= A[i] <= 10^9
 * 0 <= B[i] <= 10^9
 */
public class Problem24_AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        // Array to store the result
        int[] result = new int[A.length];
        // Sort my A array
        Arrays.sort(A);
        // Store the elements of B in the max heap
        // because we want to beat its biggest element
        // first.
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < B.length; i++) {
            maxHeap.offer(new int[]{i, B[i]});
        }
        // Left and right pointers
        int left = 0;
        int right = A.length - 1;
        // Loop until heap is empty
        while (!maxHeap.isEmpty()) {
            // Get the max element from the heap
            int[] b = maxHeap.poll();
            // If A's biggest element is smaller than B's biggest
            // element, then no need to change, otherwise use A's
            // biggest element.
            // If A's second biggest element is faster than B's
            // biggest element, then it is bigger than every other
            // element of B.
            result[b[0]] = b[1] >= A[right] ? A[left++] : A[right--];
        }
        return result;
    }
}