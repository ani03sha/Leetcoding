package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcoding.challenge.Problem23_TwoSumIVInputIsABST.TreeNode;

class Problem23_TwoSumIVInputIsABSTTest {

    private final Problem23_TwoSumIVInputIsABST testObject = new Problem23_TwoSumIVInputIsABST();

    @Test
    void testFindTarget() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int k = 9;
        assertTrue(testObject.findTarget(root, k));

        k = 28;
        assertFalse(testObject.findTarget(root, k));
    }
}