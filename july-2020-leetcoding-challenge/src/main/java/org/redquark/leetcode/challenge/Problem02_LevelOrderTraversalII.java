package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right,
 * level by level from leaf to root).
 */
public class Problem02_LevelOrderTraversalII {

    /**
     * @param root - Root of the given binary tree
     * @return 2D list of level order traversal bottom up
     */
    public List<List<Integer>> levelOrderBottom(Node root) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // DFS
        dfs(root, 0, result);
        return result;
    }

    private void dfs(Node node, int level, List<List<Integer>> result) {
        // Base condition
        if (node == null) {
            return;
        }
        if (result.size() > level) {
            result.get(result.size() - 1 - level).add(node.data);
        } else {
            List<Integer> temp = new ArrayList<>();
            temp.add(node.data);
            result.add(0, temp);
        }
        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
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
