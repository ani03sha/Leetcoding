package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversal.TreeNode;

class Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private final Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversal testObject =
            new Problem08_ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void testBuildTree() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode expected = testObject.buildTree(preorder, inorder);
        assertEquals(3, expected.val);
        assertEquals(9, expected.left.val);
        assertEquals(20, expected.right.val);
        assertEquals(15, expected.right.left.val);
        assertEquals(7, expected.right.right.val);

        preorder = new int[]{-1};
        inorder = new int[]{-1};
        expected = testObject.buildTree(preorder, inorder);
        assertEquals(-1, expected.val);
    }
}