package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the
 * farthest leaf node.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * -100 <= Node.val <= 100
 */
public class Problem01_MaximumDepthOfBinaryTree {

    /**
     * @param root - root of the binary tree
     * @return maximum depth of the tree
     */
    public int maxDepth(Node root) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // left height
        int left = maxDepth(root.left);
        // Right height
        int right = maxDepth(root.right);
        // Take the maximum of two and add one (for the root) to it
        return left > right ? left + 1 : right + 1;
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
