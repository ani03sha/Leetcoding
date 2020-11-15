package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root node of a binary search tree, return the sum of values of all nodes with a value
 * in the range [low, high].
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 2 * 10^4].
 * 1 <= Node.val <= 10^5
 * 1 <= low <= high <= 10^5
 * All Node.val are unique.
 */
public class Problem15_RangeSumOfBST {

    /**
     * @param root - root of the BST
     * @param low  - lower bound
     * @param high - higher bound
     * @return sum between lower and higher bounds
     */
    public int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.data < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.data > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.data + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
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
