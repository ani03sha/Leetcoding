package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem16_BinaryTreeCameras.TreeNode;

class Problem16_BinaryTreeCamerasTest {

    private final Problem16_BinaryTreeCameras testObject = new Problem16_BinaryTreeCameras();

    @Test
    void testMinCameraCover() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        assertEquals(1, testObject.minCameraCover(root));
    }
}