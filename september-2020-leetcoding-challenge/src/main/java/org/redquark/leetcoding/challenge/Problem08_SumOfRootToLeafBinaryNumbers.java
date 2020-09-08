package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number
 * starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this
 * could represent 01101 in binary, which is 13.
 * <p>
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * <p>
 * Return the sum of these numbers.
 * <p>
 * Note:
 * <p>
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 */
public class Problem08_SumOfRootToLeafBinaryNumbers {

    /**
     * @param root - root of the given binary tree
     * @return sum of root to leaf
     */
    public int sumRootToLeaf(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        if (root.left != null) {
            root.left.data += root.data * 2;
        }
        if (root.right != null) {
            root.right.data += root.data * 2;
        }
        return sumRootToLeaf(root.left) + sumRootToLeaf(root.right);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
