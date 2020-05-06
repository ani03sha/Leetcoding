package org.redquark.leetcode.learn.binarytrees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.learn.binarytrees.Problem06_SymmetricTree.Node;

class Problem06_SymmetricTreeTest {

    private final Problem06_SymmetricTree testObject = new Problem06_SymmetricTree();

    @Test
    void isSymmetric() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        assertTrue(testObject.isSymmetric(root));
    }
}