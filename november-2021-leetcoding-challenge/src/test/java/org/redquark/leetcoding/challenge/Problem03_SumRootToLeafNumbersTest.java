package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem03_SumRootToLeafNumbers.TreeNode;

class Problem03_SumRootToLeafNumbersTest {

    private final Problem03_SumRootToLeafNumbers testObject = new Problem03_SumRootToLeafNumbers();

    @Test
    void testSumNumbers() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(25, testObject.sumNumbers(root));

        root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        assertEquals(1026, testObject.sumNumbers(root));
    }
}