package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal.TreeNode;

class Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private final Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal testObject =
            new Problem21_ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void testBuildTree() {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        TreeNode expected = testObject.buildTree(inorder, postorder);
        assertEquals(3, expected.val);
        assertEquals(9, expected.left.val);
        assertEquals(20, expected.right.val);
        assertEquals(15, expected.right.left.val);
        assertEquals(7, expected.right.right.val);
    }
}