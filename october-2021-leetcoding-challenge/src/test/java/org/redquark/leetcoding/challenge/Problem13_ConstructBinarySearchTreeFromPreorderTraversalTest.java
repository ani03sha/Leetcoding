package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcoding.challenge.Problem13_ConstructBinarySearchTreeFromPreorderTraversal.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_ConstructBinarySearchTreeFromPreorderTraversalTest {

    private final Problem13_ConstructBinarySearchTreeFromPreorderTraversal testObject
            = new Problem13_ConstructBinarySearchTreeFromPreorderTraversal();

    @Test
    void testBstFromPreorder() {
        int[] preorder = new int[]{8, 5, 1, 7, 10, 12};
        TreeNode expected = testObject.bstFromPreorder(preorder);
        assertEquals(8, expected.val);
        assertEquals(5, expected.left.val);
        assertEquals(10, expected.right.val);
        assertEquals(1, expected.left.left.val);
        assertEquals(7, expected.left.right.val);
        assertEquals(12, expected.right.right.val);
    }
}