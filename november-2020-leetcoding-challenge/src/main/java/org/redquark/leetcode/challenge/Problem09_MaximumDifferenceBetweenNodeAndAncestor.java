package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, find the maximum value V for which there exist
 * different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.
 * <p>
 * A node A is an ancestor of B if either: any child of A is equal to B, or any child
 * of A is an ancestor of B
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 5000].
 * 0 <= Node.val <= 10^5
 */
public class Problem09_MaximumDifferenceBetweenNodeAndAncestor {

    private int maxDifference;

    /**
     * @param root - root of the given tree
     * @return maximum difference between ancestor and its ancestor
     */
    public int maxAncestorDiff(Node root) {
        if (root == null) {
            return 0;
        }
        dfs(root, root.data, root.data);
        return maxDifference;
    }

    private void dfs(Node root, int min, int max) {
        if (root == null) {
            return;
        }
        // Difference with the root
        int x = Math.abs(root.data - min);
        int y = Math.abs(root.data - max);
        // Find max difference from those values
        maxDifference = Math.max(maxDifference, x);
        maxDifference = Math.max(maxDifference, y);
        // DFS in sub-trees
        dfs(root.left, Math.min(min, root.data), Math.max(max, root.data));
        dfs(root.right, Math.min(min, root.data), Math.max(max, root.data));
    }

    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
