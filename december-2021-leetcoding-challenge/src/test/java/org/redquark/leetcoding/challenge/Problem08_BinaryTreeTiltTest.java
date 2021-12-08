package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem08_BinaryTreeTilt.TreeNode;

class Problem08_BinaryTreeTiltTest {

    private final Problem08_BinaryTreeTilt testObject = new Problem08_BinaryTreeTilt();

    @Test
    void testFindTilt() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(1, testObject.findTilt(root));

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        assertEquals(16, testObject.findTilt(root));
    }
}