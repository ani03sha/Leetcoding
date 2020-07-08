package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array numbers of n integers, are there elements a, b, c in numbers such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * The solution set must not contain duplicate triplets.
 */
public class Problem08_3Sum {

    /**
     * @param numbers - input array
     * @return - List of triplets
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // Base condition
        if (numbers.length < 3) {
            return result;
        }
        // Sort the array
        Arrays.sort(numbers);
        // Loop for each element of the array
        for (int i = 0; i < numbers.length - 2; i++) {
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                int target = -numbers[i];
                // Pointers
                int start = i + 1;
                int end = numbers.length - 1;
                // Loop for elements using these two pointers
                while (start < end) {
                    if (numbers[start] + numbers[end] == target) {
                        result.add(Arrays.asList(numbers[i], numbers[start], numbers[end]));
                        // Remove duplicates
                        while (start < end && numbers[end] == numbers[end - 1]) {
                            end--;
                        }
                        while (start < end && numbers[start] == numbers[start + 1]) {
                            start++;
                        }
                        start++;
                        end--;
                    } else if (numbers[start] + numbers[end] > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
