package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem09_ConvertBSTToGreaterTree.TreeNode;

class Problem09_ConvertBSTToGreaterTreeTest {

    private final Problem09_ConvertBSTToGreaterTree testObject =
            new Problem09_ConvertBSTToGreaterTree();

    @Test
    void testConvertBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        TreeNode expected = testObject.convertBST(root);
        assertEquals(30, expected.val);
        assertEquals(36, expected.left.val);
        assertEquals(21, expected.right.val);
    }
}