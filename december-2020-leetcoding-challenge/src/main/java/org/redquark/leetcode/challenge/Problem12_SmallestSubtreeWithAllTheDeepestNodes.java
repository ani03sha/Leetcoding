package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma (
 * <p>
 * Given the root of a binary tree, the depth of each node is the shortest distance to the root.
 * <p>
 * Return the smallest subtree such that it contains all the deepest nodes in the original tree.
 * <p>
 * A node is called the deepest if it has the largest depth possible among any node in the entire tree.
 * <p>
 * The subtree of a node is tree consisting of that node, plus the set of all descendants of that node.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree will be in the range [1, 500].
 * 0 <= Node.val <= 500
 * The values of the nodes in the tree are unique.
 */
public class Problem12_SmallestSubtreeWithAllTheDeepestNodes {

    /**
     * @param root - root of the binary tree
     * @return smallest subtree with deepest nodes
     */
    public Node subtreeWithAllDeepest(Node root) {
        // Base condition
        if (root == null) {
            return null;
        }
        // Get the height of the left subtree
        int leftHeight = getHeight(root.left);
        // Get the height of the right subtree
        int rightHeight = getHeight(root.right);
        // If both the heights are same
        if (leftHeight == rightHeight) {
            return root;
        } else if (leftHeight < rightHeight) {
            return subtreeWithAllDeepest(root.right);
        } else {
            return subtreeWithAllDeepest(root.left);
        }
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
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
