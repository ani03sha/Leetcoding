package org.redquark.leetcode.learn.binarytrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the postorder traversal of its nodes' values.
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
 * Output: [3,2,1]
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Problem03_PostorderTraversal {

    /**
     * @param root - root of the binary tree
     * @return - post order traversal list
     */
    public List<Integer> postorderTraversal(Node root) {
        // Base condition
        if (root == null) {
            return Collections.emptyList();
        }
        // Stack to keep track of nodes
        Stack<Node> stack = new Stack<>();
        // Push the root in the stack
        stack.push(root);
        // Another stack to keep the traversed nodes
        Stack<Integer> outputStack = new Stack<>();
        // Loop for each node of the tree
        while (!stack.isEmpty()) {
            // Get the current node
            Node current = stack.pop();
            // Store the data in output stack
            outputStack.push(current.data);
            // Push left and right children of the popped node
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        // List to store post order elements
        List<Integer> postorderList = new ArrayList<>(outputStack);
        Collections.reverse(postorderList);
        return postorderList;
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
