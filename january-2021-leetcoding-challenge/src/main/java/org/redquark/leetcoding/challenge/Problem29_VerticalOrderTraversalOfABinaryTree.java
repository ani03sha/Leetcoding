package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
 * <p>
 * For each node at position (x, y), its left and right children will be at positions
 * (x - 1, y - 1) and (x + 1, y - 1) respectively.
 * <p>
 * The vertical order traversal of a binary tree is a list of non-empty reports for each unique
 * x-coordinate from left to right.
 * Each report is a list of all nodes at a given x-coordinate.
 * The report should be primarily sorted by y-coordinate from highest y-coordinate to lowest.
 * If any two nodes have the same y-coordinate in the report, the node with the smaller value
 * should appear earlier.
 * <p>
 * Return the vertical order traversal of the binary tree.
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * 0 <= Node.val <= 1000
 */
public class Problem29_VerticalOrderTraversalOfABinaryTree {

    /**
     * @param root - root of the binary tree
     * @return vertical order traversal of binary tree
     */
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // List to store the result
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (root == null) {
            return result;
        }
        // Map to store x index as the key and set of y and data as value
        Map<Integer, List<int[]>> nodeMap = new TreeMap<>();
        dfs(root, 0, 0, nodeMap);
        for (List<int[]> pairs : nodeMap.values()) {
            pairs.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
            List<Integer> values = new ArrayList<>();
            for (int[] pair : pairs) {
                values.add(pair[1]);
            }
            result.add(values);
        }
        return result;
    }

    private void dfs(TreeNode root, int x, int y, Map<Integer, List<int[]>> nodeMap) {
        // Base case
        if (root == null) {
            return;
        }
        nodeMap.putIfAbsent(x, new ArrayList<>());
        nodeMap.get(x).add(new int[]{y, root.val});
        dfs(root.left, x - 1, y + 1, nodeMap);
        dfs(root.right, x + 1, y + 1, nodeMap);
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
