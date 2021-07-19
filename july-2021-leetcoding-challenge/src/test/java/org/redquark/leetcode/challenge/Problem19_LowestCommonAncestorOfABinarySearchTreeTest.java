package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem19_LowestCommonAncestorOfABinarySearchTree.TreeNode;

class Problem19_LowestCommonAncestorOfABinarySearchTreeTest {

    private final Problem19_LowestCommonAncestorOfABinarySearchTree testObject =
            new Problem19_LowestCommonAncestorOfABinarySearchTree();

    @Test
    void testLowestCommonAncestor() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(6, testObject.lowestCommonAncestor(root, p, q).val);

        p = root.left;
        q = root.left.right;
        assertEquals(2, testObject.lowestCommonAncestor(root, p, q).val);

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        p = root;
        q = root.left;
        assertEquals(2, testObject.lowestCommonAncestor(root, p, q).val);
    }
}