package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, then value v and depth d, you need to add a row of nodes
 * with value v at the given depth d. The root node is at depth 1.
 * <p>
 * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1,
 * create two tree nodes with value v as N's left subtree root and right subtree root.
 * And N's original left subtree should be the left subtree of the new left subtree root,
 * its original right subtree should be the right subtree of the new right subtree root.
 * If depth d is 1 that means there is no depth d-1 at all, then create a tree node with
 * value v as the new root of the whole original tree, and the original tree is the new root's
 * left subtree.
 * <p>
 * Note:
 * The given d is in range [1, maximum depth of the given tree + 1].
 * The given binary tree has at least one tree node.
 */
public class Problem09_AddOneRowToTree {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        // Base cases
        if (root == null) {
            return new TreeNode(v);
        }
        if (d == 1) {
            TreeNode tempRoot = root;
            root = new TreeNode(v);
            root.left = tempRoot;
            return root;
        }
        // List to store the nodes level by level
        List<List<TreeNode>> levelNodes = new ArrayList<>();
        // Queue for each level
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.add(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // List to store the current level
            List<TreeNode> currentLevelNodes = new ArrayList<>();
            // Size of the current level
            int size = nodes.size();
            // Loop for all the nodes at the current level
            for (int i = 0; i < size; i++) {
                // Current node
                TreeNode currentNode = nodes.poll();
                // Add this node to the list
                if (currentNode != null) {
                    currentLevelNodes.add(currentNode);
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
        // Once we reach here, we are at the d-1 th level
        // and the list contains all the nodes at d-1 th level
        // Get the list for d-1 th level
        List<TreeNode> dthLevelNodes = levelNodes.get(d - 2);
        for (TreeNode currentNode : dthLevelNodes) {
            // Get the current node
            // Original left and right children of currentNode
            TreeNode originalLeftChild = currentNode.left;
            TreeNode originalRightChild = currentNode.right;
            // Add new row
            currentNode.left = new TreeNode(v);
            currentNode.right = new TreeNode(v);
            // Reconnect original subtree
            currentNode.left.left = originalLeftChild;
            currentNode.right.right = originalRightChild;
        }
        return root;
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
