package org.redquark.leetcode.learn.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the inorder traversal of its nodes' values.
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
 * Output: [1,3,2]
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Problem02_InorderTraversal {

    /**
     * @param root - root of the binary tree
     * @return - inorder traversal list
     */
    public List<Integer> inorderTraversal(Node root) {
        // This list will store the inorder elements of a binary tree
        List<Integer> inorderList = new ArrayList<>();
        // Stack to keep track of nodes
        Stack<Node> stack = new Stack<>();
        // Get hold of the root node
        Node current = root;
        // If current node is null and stack is also empty, then we are done
        while (!stack.isEmpty() || current != null) {
            // If the current node is not null, push it to the stack and move towards its left child
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                // If the current node is null, we will pop it from the stack
                current = stack.pop();
                // Add the node data to the list
                inorderList.add(current.data);
                // Move towards right child
                current = current.right;
            }
        }
        return inorderList;
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
