package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique
 * combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * <p>
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency of at least one of the chosen numbers is different.
 * <p>
 * Constraints:
 * <p>
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * All elements of candidates are distinct.
 * 1 <= target <= 500
 */
public class Problem02_CombinationSum {

    /**
     * @param candidates - input array of numbers
     * @param target     - target to achieve
     * @return - List of all valid combinations
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, 0, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] candidates, int start, int target, int sum, ArrayList<Integer> temp, List<List<Integer>> result) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            dfs(candidates, i, target, sum + candidates[i], temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
