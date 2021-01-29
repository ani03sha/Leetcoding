package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.redquark.leetcoding.challenge.Problem29_VerticalOrderTraversalOfABinaryTree.TreeNode;

class Problem29_VerticalOrderTraversalOfABinaryTreeTest {

    private final Problem29_VerticalOrderTraversalOfABinaryTree testObject =
            new Problem29_VerticalOrderTraversalOfABinaryTree();

    @Test
    void testVerticalTraversal() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        printTree(testObject.verticalTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        printTree(testObject.verticalTraversal(root));
    }

    private void printTree(List<List<Integer>> verticalOrderTraversal) {
        for (List<Integer> list : verticalOrderTraversal) {
            System.out.print(list + " ");
        }
        System.out.println();
    }
}