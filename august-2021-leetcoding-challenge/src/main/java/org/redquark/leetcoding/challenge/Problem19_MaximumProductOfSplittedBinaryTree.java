package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such
 * that the product of the sums of the subtrees is maximized.
 * <p>
 * Return the maximum product of the sums of the two subtrees. Since the answer may be too large,
 * return it modulo 10^9 + 7.
 * <p>
 * Note that you need to maximize the answer before taking the mod and not after taking it.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 5 * 10^4].
 * 1 <= Node.val <= 10^4
 */
public class Problem19_MaximumProductOfSplittedBinaryTree {

    public int maxProduct(TreeNode root) {
        final long MODULO = 1000000007;
        long maxProduct = 0;
        // Sum of all subtrees
        List<Integer> allSums = new ArrayList<>();
        // Total sum
        int totalSum = getSum(root, allSums);
        // Loop through the list
        for (long sum : allSums) {
            maxProduct = Math.max(maxProduct, sum * (totalSum - sum));
        }
        return (int) (maxProduct % MODULO);
    }

    private int getSum(TreeNode node, List<Integer> allSums) {
        if (node == null) {
            return 0;
        }
        int sum = getSum(node.left, allSums) + getSum(node.right, allSums) + node.val;
        allSums.add(sum);
        return sum;
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
