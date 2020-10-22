package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to
 * the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * 1. The number of nodes in the tree is in the range [0, 10^5].
 * 2. -1000 <= Node.val <= 1000
 */
public class Problem22_MinimumDepthOfBinaryTree {

    /**
     * @param root - root of the binary tree
     * @return minimum depth
     */
    public int minDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null && root.left != null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
        }
    }

    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
