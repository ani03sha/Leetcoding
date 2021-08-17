package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcoding.challenge.Problem17_CountGoodNodesInBinaryTree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_CountGoodNodesInBinaryTreeTest {

    private final Problem17_CountGoodNodesInBinaryTree testObject = new Problem17_CountGoodNodesInBinaryTree();

    @Test
    void testGoodNodes() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        assertEquals(4, testObject.goodNodes(root));

        root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(3, testObject.goodNodes(root));
    }
}