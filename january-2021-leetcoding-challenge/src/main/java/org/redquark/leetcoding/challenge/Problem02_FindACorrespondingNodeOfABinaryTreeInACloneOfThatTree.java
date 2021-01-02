package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two binary trees original and cloned and given a reference to a node target in the original tree.
 * <p>
 * The cloned tree is a copy of the original tree.
 * <p>
 * Return a reference to the same node in the cloned tree.
 * <p>
 * Note that you are not allowed to change any of the two trees or the target node and the answer must be a
 * reference to a node in the cloned tree.
 * <p>
 * Follow up: Solve the problem if repeated values on the tree are allowed.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * The values of the nodes of the tree are unique.
 * target node is a node from the original tree and is not null.
 */
public class Problem02_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    /**
     * @param original - root of the original tree
     * @param cloned   - root of the cloned tree
     * @param target   - target value to be searched
     * @return reference to the target in the cloned tree
     */
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Base condition
        if (original == null) {
            return cloned;
        }
        return dfs(original, cloned, target);
    }

    private TreeNode dfs(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original == target) {
            return cloned;
        }
        // Traverse left subtree
        if (original.left != null) {
            TreeNode left = dfs(original.left, cloned.left, target);
            if (left != null) {
                return left;
            }
        }
        // Traverse right subtree
        if (original.right != null) {
            return dfs(original.right, cloned.right, target);
        }
        return null;
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
