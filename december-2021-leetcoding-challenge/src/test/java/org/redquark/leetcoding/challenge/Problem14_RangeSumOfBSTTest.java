package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem14_RangeSumOfBST.TreeNode;

class Problem14_RangeSumOfBSTTest {

    private final Problem14_RangeSumOfBST testObject = new Problem14_RangeSumOfBST();

    @Test
    void testRangeSumBST() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int low = 7;
        int high = 15;
        assertEquals(32, testObject.rangeSumBST(root, low, high));
    }
}