package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given the root of a binary tree with n nodes, where each node is uniquely
 * assigned a value from 1 to n.
 * <p>
 * You are also given a sequence of n values voyage, which is the desired pre-order
 * traversal of the binary tree.
 * <p>
 * Any node in the binary tree can be flipped by swapping its left and right subtrees.
 * <p>
 * Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.
 * <p>
 * Return a list of the values of all flipped nodes. You may return the answer in any order.
 * If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage,
 * return the list [-1].
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is n.
 * n == voyage.length
 * 1 <= n <= 100
 * 1 <= Node.val, voyage[i] <= n
 * All the values in the tree are unique.
 * All the values in voyage are unique.
 */
public class Problem29_FlipBinaryTreeToMatchPreorderTraversal {

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        // List to store results
        List<Integer> result = new ArrayList<>();
        // Index fot the current position in the
        // voyage array
        int index = 0;
        // Stack to store tree nodes
        Stack<TreeNode> nodes = new Stack<>();
        // Add root to the stack
        nodes.push(root);
        // Loop until the stack is empty
        while (!nodes.isEmpty()) {
            // Get the node at the head
            TreeNode currentNode = nodes.pop();
            // If the current node is null, return
            if (currentNode == null) {
                continue;
            }
            // If the values at current sub root don't match
            if (currentNode.val != voyage[index++]) {
                return Collections.singletonList(-1);
            }
            // If the values match
            if (currentNode.right != null && currentNode.right.val == voyage[index]) {
                if (currentNode.left != null) {
                    result.add(currentNode.val);
                }
                nodes.push(currentNode.left);
                nodes.push(currentNode.right);
            } else {
                nodes.push(currentNode.right);
                nodes.push(currentNode.left);
            }
        }
        return result;
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
