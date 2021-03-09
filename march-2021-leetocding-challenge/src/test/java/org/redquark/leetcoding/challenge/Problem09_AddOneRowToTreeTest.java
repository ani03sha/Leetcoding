package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem09_AddOneRowToTree.TreeNode;

class Problem09_AddOneRowToTreeTest {

    private final Problem09_AddOneRowToTree testObject = new Problem09_AddOneRowToTree();

    @Test
    void testAddOneRow() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);
        int v = 1;
        int d = 2;
        TreeNode expected = testObject.addOneRow(root, v, d);
        assertEquals(1, expected.left.val);
        assertEquals(1, expected.right.val);
        assertEquals(2, expected.left.left.val);
        assertEquals(6, expected.right.right.val);

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        v = 1;
        d = 3;
        expected = testObject.addOneRow(root, v, d);
        assertEquals(1, expected.left.left.val);
        assertEquals(1, expected.left.right.val);
        assertEquals(3, expected.left.left.left.val);
    }
}