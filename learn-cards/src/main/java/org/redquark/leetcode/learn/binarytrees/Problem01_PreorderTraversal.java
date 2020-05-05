package org.redquark.leetcode.learn.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Example:
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [1,2,3]
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Problem01_PreorderTraversal {

    /**
     * @param root - root of the binary tree
     * @return the preorder traversal list
     */
    public List<Integer> preorderTraversal(Node root) {
        // This list will store the preorder traversal of the tree
        List<Integer> preorderList = new ArrayList<>();
        // Base condition
        if (root == null) {
            return preorderList;
        }
        // This stack will keep track of left and right child
        Stack<Node> stack = new Stack<>();
        // Push node in the stack
        stack.push(root);
        // Loop for each node in the list
        while (!stack.isEmpty()) {
            // Get the head of the stack
            Node currentNode = stack.pop();
            // Add the data to the result list
            preorderList.add(currentNode.data);

            // Since stack is LIFO, we need to push right child first
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            // Push the left child
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return preorderList;
    }

    /**
     * This class represents each node of the binary tree
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
