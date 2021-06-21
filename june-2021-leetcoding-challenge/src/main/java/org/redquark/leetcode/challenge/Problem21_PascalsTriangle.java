package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */
public class Problem21_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = Collections.singletonList(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            // Get the previous row
            List<Integer> previousRow = result.get(i - 1);
            // Current row
            List<Integer> currentRow = new ArrayList<>();
            // Add the first element
            currentRow.add(1);
            // Loop for remaining elements
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}
