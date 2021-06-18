package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, handle multiple queries of the following types:
 * <p>
 * Update the value of an element in nums.
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * <p>
 * Implement the NumArray class:
 * <p>
 * - NumArray(int[] nums) Initializes the object with the integer array nums.
 * - void update(int index, int val) Updates the value of nums[index] to be val.
 * - int sumRange(int left, int right) Returns the sum of the elements of nums between indices left
 * and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 10^4
 * -100 <= nums[i] <= 100
 * 0 <= index < nums.length
 * -100 <= val <= 100
 * 0 <= left <= right < nums.length
 * At most 3 * 104 calls will be made to update and sumRange.
 */
public class Problem18_RangeSumQueryMutable {

    static class NumArray {

        private final TreeNode root;

        public NumArray(int[] nums) {
            root = build(nums, 0, nums.length - 1);
        }

        public void update(int index, int val) {
            updateHelper(root, index, val);
        }

        public int sumRange(int left, int right) {
            return sumRangeHelper(root, left, right);
        }

        private void updateHelper(TreeNode root, int index, int val) {
            if (root.start == root.end) {
                root.sum = val;
            } else {
                int middle = root.start + (root.end - root.start) / 2;
                if (index <= middle) {
                    updateHelper(root.left, index, val);
                } else {
                    updateHelper(root.right, index, val);
                }
                root.sum = root.left.sum + root.right.sum;
            }
        }

        private int sumRangeHelper(TreeNode root, int left, int right) {
            if (root.end == right && root.start == left) {
                return root.sum;
            } else {
                int middle = root.start + (root.end - root.start) / 2;
                if (right <= middle) {
                    return sumRangeHelper(root.left, left, right);
                } else if (left >= middle + 1) {
                    return sumRangeHelper(root.right, left, right);
                } else {
                    return sumRangeHelper(root.left, left, middle) + sumRangeHelper(root.right, middle + 1, right);
                }
            }
        }

        private TreeNode build(int[] nums, int start, int end) {
            if (start <= end) {
                TreeNode node = new TreeNode(start, end);
                if (start == end) {
                    node.sum = nums[start];
                } else {
                    int middle = start + (end - start) / 2;
                    node.left = build(nums, start, middle);
                    node.right = build(nums, middle + 1, end);
                    if (node.left != null && node.right != null) {
                        node.sum = node.left.sum + node.right.sum;
                    }
                }
                return node;
            }
            return null;
        }

        static class TreeNode {
            private final int start;
            private final int end;
            private TreeNode left;
            private TreeNode right;
            private int sum;

            TreeNode(int start, int end) {
                this.start = start;
                this.end = end;
                this.sum = 0;
            }
        }
    }
}
