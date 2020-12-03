package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma (
 * <p>
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the
 * tree is now the root of the tree, and every node has no left child and only one right child.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the given tree will be in the range [1, 100].
 * 0 <= Node.val <= 1000
 */
public class Problem03_IncreasingOrderSearchTree {

    /**
     * @param root - root of the BST
     * @return reference to the node with lowest value
     */
    public Node increasingBST(Node root) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);
        Node result = new Node(inorderList.get(0));
        Node temp = result;
        for (int i = 1; i < inorderList.size(); i++) {
            temp.right = new Node(inorderList.get(i));
            temp = temp.right;
        }
        return result;
    }

    private void inorder(Node root, List<Integer> inorderList) {
        if (root == null) {
            return;
        }
        inorder(root.left, inorderList);
        inorderList.add(root.data);
        inorder(root.right, inorderList);
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
