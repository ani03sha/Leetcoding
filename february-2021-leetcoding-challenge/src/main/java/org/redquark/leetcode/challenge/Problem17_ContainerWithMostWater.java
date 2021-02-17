package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate
 * (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai)
 * and (i, 0).
 * <p>
 * Find two lines, which, together with the x-axis forms a container, such that the
 * container contains the most water.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 * Constraints:
 * <p>
 * n == height.length
 * 2 <= n <= 3 * 10^4
 * 0 <= height[i] <= 3 * 10^4
 */
public class Problem17_ContainerWithMostWater {

    public int maxArea(int[] height) {
        // Maximum area of the container
        int maximumArea = Integer.MIN_VALUE;
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Shorter bar
            int shortedBar = Math.min(height[left], height[right]);
            // Update the maximum area, if required
            maximumArea = Math.max(maximumArea, shortedBar * (right - left));
            // If there is a longer vertical bar is present
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }
}
