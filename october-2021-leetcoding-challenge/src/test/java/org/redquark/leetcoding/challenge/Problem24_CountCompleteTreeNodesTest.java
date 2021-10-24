package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem24_CountCompleteTreeNodes.TreeNode;

class Problem24_CountCompleteTreeNodesTest {

    private final Problem24_CountCompleteTreeNodes testObject = new Problem24_CountCompleteTreeNodes();

    @Test
    void testCountNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        assertEquals(6, testObject.countNodes(root));

        assertEquals(0, testObject.countNodes(null));

        root = new TreeNode(1);
        assertEquals(1, testObject.countNodes(root));
    }
}