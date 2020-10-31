package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given the root of a binary search tree (BST), where exactly two nodes of the tree
 * were swapped by mistake. Recover the tree without changing its structure.
 * <p>
 * Follow up: A solution using O(n) space is pretty straight forward.
 * Could you devise a constant space solution?
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 1000].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class Problem31_RecoverBinarySearchTree {

    private Node firstIncorrectNode;
    private Node lastIncorrectNode;
    private Node previousNode;

    /**
     * @param root - root of the binary tree
     */
    public Node recoverTree(Node root) {
        findIncorrectNodes(root);
        int temp = firstIncorrectNode.data;
        firstIncorrectNode.data = lastIncorrectNode.data;
        lastIncorrectNode.data = temp;
        return root;
    }

    private void findIncorrectNodes(Node root) {
        if (root == null) {
            return;
        }
        findIncorrectNodes(root.left);
        if (previousNode != null) {
            if (previousNode.data > root.data) {
                if (firstIncorrectNode == null) {
                    firstIncorrectNode = previousNode;
                }
                lastIncorrectNode = root;
            }
        }
        previousNode = root;
        findIncorrectNodes(root.right);
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
