package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where each
 * path's sum equals targetSum.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */
public class Problem04_PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // List to store the output
        List<List<Integer>> output = new ArrayList<>();
        // Traverse the entire tree
        helper(root, targetSum, new ArrayList<>(), output);
        return output;
    }

    private void helper(TreeNode node, int sum, List<Integer> path, List<List<Integer>> output) {
        // Base case
        if (node == null) {
            return;
        }
        // Add the data in current node to the list
        path.add(node.val);
        // Check if we have reached the leaves
        if (sum == node.val && node.left == null && node.right == null) {
            output.add(path);
            return;
        }
        // Traverse left and right subtrees
        helper(node.left, sum - node.val, new ArrayList<>(path), output);
        helper(node.right, sum - node.val, new ArrayList<>(path), output);
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
