package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem04_SumOfLeftLeaves.TreeNode;

class Problem04_SumOfLeftLeavesTest {

    private final Problem04_SumOfLeftLeaves testObject = new Problem04_SumOfLeftLeaves();

    @Test
    void testSumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(24, testObject.sumOfLeftLeaves(root));

        root = new TreeNode(1);
        assertEquals(0, testObject.sumOfLeftLeaves(root));
    }
}