package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two binary search trees root1 and root2.
 * <p>
 * Return a list containing all the integers from both trees sorted in ascending order.
 * <p>
 * Constraints:
 * <p>
 * Each tree has at most 5000 nodes.
 * Each node's value is between [-10^5, 10^5].
 */
public class Problem05_AllElementsInTwoBinarySearchTrees {

    /**
     * @param root1 - root of the first BST
     * @param root2 - root of the second BST
     * @return - list of all the nodes in both binary tree in sorted order
     */
    public List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> result = new ArrayList<>();
        traverse(root1, result);
        traverse(root2, result);
        Collections.sort(result);
        return result;
    }

    private void traverse(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.data);
        traverse(root.left, result);
        traverse(root.right, result);
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
