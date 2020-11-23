package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The thief has found himself a new place for his thievery again.
 * There is only one entrance to this area, called the "root."
 * Besides the root, each house has one and only one parent house.
 * After a tour, the smart thief realized that "all houses in this place forms a binary tree".
 * It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 */
public class Problem23_HouseRobberIII {

    /**
     * @param root - root of the tree
     * @return maximum amount of money the thief can rob
     */
    public int rob(Node root) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // The array stores max loot when root is selected and when it's not selected
        int[] loot = robHelper(root);
        return Math.max(loot[0], loot[1]);
    }

    private int[] robHelper(Node root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] loot = new int[2];
        int[] left = robHelper(root.left);
        int[] right = robHelper(root.right);
        // When root is selected
        loot[0] = root.data + left[1] + right[1];
        // When root is not selected
        loot[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return loot;
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
