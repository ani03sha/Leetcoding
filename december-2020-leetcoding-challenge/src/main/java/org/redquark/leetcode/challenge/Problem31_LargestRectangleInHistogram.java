package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 */
public class Problem31_LargestRectangleInHistogram {

    /**
     * @param heights - heights of the histogram
     * @return area of largest rectangle
     */
    public int largestRectangleArea(int[] heights) {
        // Base condition
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        // Stack to store values
        Stack<Integer> stack = new Stack<>();
        // Copy array
        int[] copy = Arrays.copyOf(heights, heights.length + 1);
        // This variable will score the max area
        int maxArea = 0;
        // Index to iterate array
        int index = 0;
        // Loop through the copy array
        while (index < copy.length) {
            if (stack.isEmpty() || copy[index] > copy[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                int i = stack.pop();
                int localArea = copy[i] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, localArea);
            }
        }
        return maxArea;
    }
}
