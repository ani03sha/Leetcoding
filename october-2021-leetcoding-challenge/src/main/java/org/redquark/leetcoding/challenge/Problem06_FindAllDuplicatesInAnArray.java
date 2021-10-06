package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

public class Problem06_FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        // List to store the duplicates
        List<Integer> duplicates = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return duplicates;
        }
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Get the index of the element to process
            int index = Math.abs(nums[i]) - 1;
            // Check if we have encountered this element before
            if (nums[index] > 0) {
                nums[index] *= -1;
            } else {
                duplicates.add(index + 1);
            }
        }
        return duplicates;
    }
}
