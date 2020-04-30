package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty binary tree, find the maximum path sum.
 * <p>
 * For this problem, a path is defined as any sequence of nodes from some starting node to
 * any node in the tree along the parent-child connections.
 * <p>
 * The path must contain at least one node and does not need to go through the root.
 */
public class Challenge29_BinaryTreeMaximumPathSum {

    protected Node root;

    /**
     * @param root - root of the binary tree
     * @return - maximum sum of the path in a binary tree
     */
    public int maxPathSum(Node root) {
        // Create instance of the Result node
        Result result = new Result();
        // Assign the minimum integer value to the value
        result.value = Integer.MIN_VALUE;

        findMax(root, result);
        return result.value;
    }

    private int findMax(Node node, Result result) {
        // Base condition
        if (node == null) {
            return 0;
        }
        // Maximum sum for the left subtree
        int l = findMax(node.left, result);
        // Maximum sum for the right subtree
        int r = findMax(node.right, result);

        // Max path for parent call of root. This path must include at-most one child of root
        int maxSingle = Math.max(Math.max(l, r) + node.data, node.data);

        // Max Top represents the sum when the Node under
        // consideration is the root of the maxsum path and no
        // ancestors of root are there in max sum path
        int maxTop = Math.max(maxSingle, l + r + node.data);

        // Store the maximum result
        result.value = Math.max(result.value, maxTop);

        return maxSingle;
    }

    private static class Result {
        private int value;
    }

    /**
     * This class represents each node of the Binary Tree
     */
    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
