package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem19_MaximumProductOfSplittedBinaryTree.TreeNode;

class Problem19_MaximumProductOfSplittedBinaryTreeTest {

    private final Problem19_MaximumProductOfSplittedBinaryTree testObject = new Problem19_MaximumProductOfSplittedBinaryTree();

    @Test
    void testMaxProduct() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        assertEquals(110, testObject.maxProduct(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(6);
        assertEquals(90, testObject.maxProduct(root));

        root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(11);
        root.left.right.right = new TreeNode(1);
        assertEquals(1025, testObject.maxProduct(root));

        root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertEquals(1, testObject.maxProduct(root));
    }
}