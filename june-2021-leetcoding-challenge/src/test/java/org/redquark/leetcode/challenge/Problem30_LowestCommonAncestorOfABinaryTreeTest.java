package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem30_LowestCommonAncestorOfABinaryTree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_LowestCommonAncestorOfABinaryTreeTest {

    private final Problem30_LowestCommonAncestorOfABinaryTree testObject = new Problem30_LowestCommonAncestorOfABinaryTree();

    @Test
    void testLowestCommonAncestor() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        assertEquals(root, testObject.lowestCommonAncestor(root, root.left, root.right));

        assertEquals(root.left, testObject.lowestCommonAncestor(root, root.left, root.left.right.right));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(root, testObject.lowestCommonAncestor(root, root, root.left));
    }
}