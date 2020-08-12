package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <p>
 * Follow up:
 * <p>
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class Problem12_PascalTriangleII {

    /**
     * @param rowIndex - input row
     * @return number of elements in that row
     */
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> result = new ArrayList<>();
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        List<Integer> firstRow = Collections.singletonList(1);
        result.add(firstRow);

        for (int i = 1; i <= rowIndex + 1; i++) {
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
        return result.get(rowIndex);
    }
}
