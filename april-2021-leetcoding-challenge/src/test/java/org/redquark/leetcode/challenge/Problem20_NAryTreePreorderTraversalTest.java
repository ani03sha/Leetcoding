package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.redquark.leetcode.challenge.Problem20_NAryTreePreorderTraversal.Node;

class Problem20_NAryTreePreorderTraversalTest {

    private final Problem20_NAryTreePreorderTraversal testObject = new Problem20_NAryTreePreorderTraversal();

    @Test
    void testPreorder() {
        Node root = new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6))), new Node(2, null), new Node(4, null)));
        System.out.println(testObject.preorder(root));
    }
}