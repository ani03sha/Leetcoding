package org.redquark.leetcode.learn.arrays;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * <p>
 * Return the minimum number of students that must move in order for all students to be standing
 * in non-decreasing order of height.
 * <p>
 * Notice that when a group of students is selected they can reorder in any possible way between
 * themselves and the non selected students remain on their seats.
 */
public class Problem13_HeightChecker {

    public int heightChecker(int[] heights) {
        // This will track the number of times a student has changed its position
        int count = 0;
        // Make copy of the original array
        int[] heightsCopy = Arrays.copyOf(heights, heights.length);
        // Sort the array (nlogn)
        Arrays.sort(heightsCopy);
        // Loop through both the arrays
        for (int i = 0; i < heights.length; i++) {
            // Increment count if the numbers at i are different in both the arrays
            if (heights[i] != heightsCopy[i]) {
                count++;
            }
        }
        return count;
    }
}
