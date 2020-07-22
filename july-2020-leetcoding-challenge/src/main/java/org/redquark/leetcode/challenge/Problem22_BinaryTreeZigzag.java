package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right,
 * then right to left for the next level and alternate between).
 */
public class Problem22_BinaryTreeZigzag {

    /**
     * @param root - root of the binary tree
     * @return Zigzag traversal of binary tree
     */
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // Base condition
        if (root == null) {
            return result;
        }
        // Queue to store nodes of the tree
        Queue<Node> queue = new LinkedList<>();
        // Add root to the queue
        queue.offer(root);
        // Loop until queue is not empty
        while (!queue.isEmpty()) {
            // Get the size of the queue
            int size = queue.size();
            // List for each level
            List<Integer> levelList = new ArrayList<>();
            if (result.size() % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    if (node != null) {
                        levelList.add(node.data);
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                }
            } else {
                Stack<Integer> stack = new Stack<>();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    if (node != null) {
                        stack.push(node.data);
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                }
                while (!stack.isEmpty()) {
                    levelList.add(stack.pop());
                }
            }
            result.add(levelList);
        }
        return result;
    }

    /**
     * This class represents each node in the binary tree
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
