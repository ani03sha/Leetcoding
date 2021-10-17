package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

public class Problem17_PathSumIII {

    public int pathSum(TreeNode root, int target) {
        return pathSumHelper(root, target, 0, new HashMap<>());
    }

    private int pathSumHelper(TreeNode node, int target, int cumulativeSum, Map<Integer, Integer> pathCount) {
        // Base case
        if (node == null) {
            return 0;
        }
        // Update cumulative sum by adding value at the current node
        cumulativeSum += node.val;
        // Get the difference of cumulative sum and the target
        int difference = cumulativeSum - target;
        // Total paths with the given difference
        int totalPaths = pathCount.getOrDefault(difference, 0);
        // If the cumulative sum is equal to the target, the a valid path is found
        if (difference == 0) {
            totalPaths++;
        }
        // Update the hash map
        updatePathCount(pathCount, cumulativeSum, 1);
        // Recurse for left and right subtrees
        totalPaths += pathSumHelper(node.left, target, cumulativeSum, pathCount);
        totalPaths += pathSumHelper(node.right, target, cumulativeSum, pathCount);
        // Decrement the path count as this node is done
        updatePathCount(pathCount, cumulativeSum, -1);
        return totalPaths;
    }

    private void updatePathCount(Map<Integer, Integer> pathCount, int cumulativeSum, int delta) {
        int count = pathCount.getOrDefault(cumulativeSum, 0) + delta;
        if (count == 0) {
            pathCount.remove(cumulativeSum);
        } else {
            pathCount.put(cumulativeSum, count);
        }
    }

    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
