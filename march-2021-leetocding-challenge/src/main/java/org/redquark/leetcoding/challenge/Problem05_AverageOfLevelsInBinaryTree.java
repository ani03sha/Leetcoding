package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty binary tree, return the average value of the nodes on each level in the
 * form of an array.
 * <p>
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */
public class Problem05_AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        // List to store the average values
        List<Double> averages = new ArrayList<>();
        // Special case
        if (root == null) {
            return averages;
        }
        // List to store the nodes level by level
        List<List<Integer>> levelNodes = new ArrayList<>();
        // Queue for each level
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.add(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // List to store the current level
            List<Integer> currentLevelNodes = new ArrayList<>();
            // Size of the current level
            int size = nodes.size();
            // Loop for all the nodes at the current level
            for (int i = 0; i < size; i++) {
                // Current node
                TreeNode currentNode = nodes.poll();
                // Add this node to the list
                if (currentNode != null) {
                    currentLevelNodes.add(currentNode.val);
                    // Recur for left and right children
                    if (currentNode.left != null) {
                        nodes.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        nodes.add(currentNode.right);
                    }
                }
            }
            // Add this list to the levelNodes
            levelNodes.add(currentLevelNodes);
        }
        // Traverse the levelNodes and find the average
        for (List<Integer> current : levelNodes) {
            averages.add(current.stream().mapToDouble(Integer::doubleValue).sum() / (double) current.size());
        }
        return averages;
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
