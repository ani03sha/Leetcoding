package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the
 * BST such that their sum is equal to the given target.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -10^4 <= Node.val <= 10^4
 * root is guaranteed to be a valid binary search tree.
 * -10^5 <= k <= 10^5
 */
public class Problem23_TwoSumIVInputIsABST {

    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k, new HashSet<>());
    }

    private boolean dfs(TreeNode node, int k, Set<Integer> differences) {
        if (node == null) {
            return false;
        }
        if (differences.contains(node.val)) {
            return true;
        }
        int difference = k - node.val;
        differences.add(difference);
        return dfs(node.left, k, differences) || dfs(node.right, k, differences);
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
