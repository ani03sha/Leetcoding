package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem06_BinaryTreeRightSideView.TreeNode;

class Problem06_BinaryTreeRightSideViewTest {

    private final Problem06_BinaryTreeRightSideView testObject = new Problem06_BinaryTreeRightSideView();

    @Test
    void testRightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, testObject.rightSideView(root));
    }
}