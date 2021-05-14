package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcode.challenge.Problem14_FlattenBinaryTreeToLinkedList.TreeNode;

class Problem14_FlattenBinaryTreeToLinkedListTest {

    private final Problem14_FlattenBinaryTreeToLinkedList testObject = new Problem14_FlattenBinaryTreeToLinkedList();

    @Test
    void testFlatten() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        testObject.flatten(root);

        root = null;
        testObject.flatten(root);

        root = new TreeNode(0);
        testObject.flatten(root);
    }
}