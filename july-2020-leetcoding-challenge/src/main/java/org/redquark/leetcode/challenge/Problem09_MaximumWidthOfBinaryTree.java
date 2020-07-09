package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, write a function to get the maximum width of the given tree.
 * The width of a tree is the maximum width among all levels.
 * The binary tree has the same structure as a full binary tree, but some nodes are null.
 * <p>
 * The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes
 * in the level, where the null nodes between the end-nodes are also counted into the length calculation.
 * <p>
 * Note: Answer will in the range of 32-bit signed integer.
 */
public class Problem09_MaximumWidthOfBinaryTree {

    // Max width
    int maxWidth;
    // Map that will store the pairs of depth and position of the left nodes
    Map<Integer, Integer> leftPositions;

    /**
     * @param root - root of the binary tree
     * @return - maximum width
     */
    public int widthOfBinaryTree(Node root) {
        maxWidth = 0;
        leftPositions = new HashMap<>();
        getWidth(root, 0, 0);
        return maxWidth;
    }

    private void getWidth(Node root, int depth, int position) {
        if (root == null) {
            return;
        }
        leftPositions.putIfAbsent(depth, position);
        maxWidth = Math.max(maxWidth, position - leftPositions.get(depth) + 1);
        getWidth(root.left, depth + 1, position * 2);
        getWidth(root.right, depth + 1, position * 2 + 1);
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
