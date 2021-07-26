package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 * <p>
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every
 * node never differs by more than one.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in a strictly increasing order.
 */
public class Problem26_ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return null;
        }
        // Create the tree recursively
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        // Find the middle element
        int middle = start + (end - start) / 2;
        // Create the root of the subtree
        TreeNode root = new TreeNode(nums[middle]);
        // Create the left and right subtrees
        root.left = createTree(nums, start, middle - 1);
        root.right = createTree(nums, middle + 1, end);
        // Return the root
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
