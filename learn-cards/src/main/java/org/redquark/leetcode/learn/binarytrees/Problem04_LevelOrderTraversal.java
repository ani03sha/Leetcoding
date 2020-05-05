package org.redquark.leetcode.learn.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class Problem04_LevelOrderTraversal {

    /**
     * @param root - root of the binary tree
     * @return - level order traversal list
     */
    public List<List<Integer>> levelOrder(Node root) {
        // List of list to store the level order
        List<List<Integer>> levelOrderList = new ArrayList<>();
        // Base condition
        if (root == null) {
            return levelOrderList;
        }
        // Queue to store nodes
        Queue<Node> nodeQueue = new LinkedList<>();
        // Queue to store levels
        Queue<Integer> levelQueue = new LinkedList<>();

        // Push root to the queue
        nodeQueue.offer(root);
        // Push first level
        levelQueue.offer(1);
        // Loop until the node queue becomes empty
        while (!nodeQueue.isEmpty()) {
            // Get the head from the queue
            Node current = nodeQueue.poll();
            // Get the level
            int level = levelQueue.poll();
            // Level's list
            List<Integer> l = null;
            if (levelOrderList.size() < level) {
                l = new ArrayList<>();
                // Add the level to the list
                levelOrderList.add(l);
            } else {
                l = levelOrderList.get(level - 1);
            }
            l.add(current.data);

            // Move to left child
            if (current.left != null) {
                nodeQueue.offer(current.left);
                levelQueue.offer(level + 1);
            }
            // Move to right child
            if (current.right != null) {
                nodeQueue.offer(current.right);
                levelQueue.offer(level + 1);
            }
        }
        return levelOrderList;
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
