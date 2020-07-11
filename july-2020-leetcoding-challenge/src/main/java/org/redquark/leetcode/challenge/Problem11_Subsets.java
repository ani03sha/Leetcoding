package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 */
public class Problem11_Subsets {

    /**
     * @param numbers - input array which represents set
     * @return Power set of the above sets
     */
    public List<List<Integer>> subsets(int[] numbers) {
        // Output list that represents power set
        List<List<Integer>> powerSet = new ArrayList<>();
        // Function that will generate the subsets
        generateSubsets(0, numbers, new ArrayList<>(), powerSet);
        return powerSet;
    }

    private void generateSubsets(int index, int[] numbers, ArrayList<Integer> current, List<List<Integer>> powerSet) {
        powerSet.add(new ArrayList<>(current));
        for (int i = index; i < numbers.length; i++) {
            current.add(numbers[i]);
            generateSubsets(i + 1, numbers, current, powerSet);
            current.remove(current.size() - 1);
        }
    }
}
