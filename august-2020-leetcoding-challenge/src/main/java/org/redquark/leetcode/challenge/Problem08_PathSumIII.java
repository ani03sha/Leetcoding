package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a binary tree in which each node contains an integer value.
 * <p>
 * Find the number of paths that sum to a given value.
 * <p>
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 * <p>
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 */
public class Problem08_PathSumIII {

    /**
     * @param root - root of the tree
     * @param sum  - given sum
     * @return - number of paths that make sum
     */
    public int pathSum(Node root, int sum) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // Recursively call the functions where node is included and not included
        return pathSum(root.left, sum) + pathSum(root.right, sum) + nodeIncluded(root, sum);
    }

    private int nodeIncluded(Node node, int sum) {
        // Base condition
        if (node == null) {
            return 0;
        }
        // Number of paths
        int count = 0;
        // Check if we have reached the sum
        if (sum == node.data) {
            count++;
        }
        // Recursive calls to suntrees
        count += nodeIncluded(node.left, sum - node.data);
        count += nodeIncluded(node.right, sum - node.data);

        return count;
    }

    /**
     * This class represents each node in the tree
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
