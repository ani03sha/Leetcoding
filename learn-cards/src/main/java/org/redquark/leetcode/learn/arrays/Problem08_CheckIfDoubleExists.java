package org.redquark.leetcode.learn.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of
 * M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <p>
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */
public class Problem08_CheckIfDoubleExists {

    /**
     * @param arr - input array
     * @return true, if double of an element exists
     * <p>
     * Algorithm:
     * 1. Add an element to the set
     * 2. Check if its double or half exists
     * 3. If yes, return true, else false
     */
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet<>();
        for (int n : arr) {
            if (set.contains(2.0 * n) || set.contains(n / 2.0)) {
                return true;
            }
            set.add((double) n);
        }
        return false;
    }
}
