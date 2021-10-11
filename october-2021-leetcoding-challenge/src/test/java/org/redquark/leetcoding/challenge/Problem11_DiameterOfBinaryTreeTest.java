package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem11_DiameterOfBinaryTree.TreeNode;

class Problem11_DiameterOfBinaryTreeTest {

    private final Problem11_DiameterOfBinaryTree testObject = new Problem11_DiameterOfBinaryTree();

    @Test
    void testDiameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, testObject.diameterOfBinaryTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(1, testObject.diameterOfBinaryTree(root));
    }
}