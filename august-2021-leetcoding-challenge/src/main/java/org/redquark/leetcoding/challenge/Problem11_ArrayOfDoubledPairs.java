package org.redquark.leetcoding.challenge;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers arr of even length, return true if and only if it is possible to reorder it such
 * that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 <= i < len(arr) / 2.
 * <p>
 * Constraints:
 * <p>
 * 0 <= arr.length <= 3 * 10^4
 * arr.length is even.
 * -10^5 <= arr[i] <= 10^5
 */
public class Problem11_ArrayOfDoubledPairs {

    public boolean canReorderDoubled(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // Map to store the elements and their counts
        // The keys of the map will be in sorted order
        Map<Integer, Integer> frequencies = new TreeMap<>();
        // Add entries in the map
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        // Now loop for every element in the map
        for (int key : frequencies.keySet()) {
            if (frequencies.get(key) == 0) {
                continue;
            }
            // Element we want
            int wantedElement = key < 0 ? key / 2 : key * 2;
            if (key < 0 && key % 2 != 0 || frequencies.get(key) > frequencies.getOrDefault(wantedElement, 0)) {
                return false;
            }
            frequencies.put(wantedElement, frequencies.get(wantedElement) - frequencies.get(key));
        }
        return true;
    }
}
