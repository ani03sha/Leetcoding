package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where
 * v = |a.val - b.val| and a is an ancestor of b.
 * <p>
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 */
public class Problem31_MaximumDifferenceBetweenNodeAndAncestor {

    int maxDifference = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, root.val, root.val);
        return maxDifference;
    }

    private void dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }
        // Difference with the root
        int x = Math.abs(root.val - min);
        int y = Math.abs(root.val - max);
        // Find max difference from those values
        maxDifference = Math.max(maxDifference, x);
        maxDifference = Math.max(maxDifference, y);
        // DFS in sub-trees
        dfs(root.left, Math.min(min, root.val), Math.max(max, root.val));
        dfs(root.right, Math.min(min, root.val), Math.max(max, root.val));
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
