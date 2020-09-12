package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9
 * can be used and each combination should be a unique set of numbers.
 * <p>
 * Note:
 * <p>
 * All numbers will be positive integers.
 * The solution set must not contain duplicate combinations.
 */
public class Problem12_CombinationSumIII {

    /**
     * @param k - number of integers that can be used
     * @param n - target sum
     * @return - list of combinations of numbers
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (k <= 0 || n <= 0) {
            return result;
        }
        dfs(1, n, 0, k, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int start, int n, int counter, int k, int currentSum, List<Integer> temp, List<List<Integer>> result) {
        if (counter > k) {
            return;
        }
        if (currentSum == n && counter == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (currentSum + i > n) {
                break;
            }
            temp.add(i);
            dfs(i + 1, n, counter + 1, k, currentSum + i, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
