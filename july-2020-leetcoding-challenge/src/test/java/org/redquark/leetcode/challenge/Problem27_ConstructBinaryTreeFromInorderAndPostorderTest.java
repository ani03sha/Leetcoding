package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem27_ConstructBinaryTreeFromInorderAndPostorder.Node;

class Problem27_ConstructBinaryTreeFromInorderAndPostorderTest {

    private final Problem27_ConstructBinaryTreeFromInorderAndPostorder testObject =
            new Problem27_ConstructBinaryTreeFromInorderAndPostorder();

    @Test
    void tesBuildTree() {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        Node root = testObject.buildTree(inorder, postorder);
        assertEquals(9, root.left.data);
    }
}