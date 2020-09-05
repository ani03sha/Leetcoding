package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcoding.challenge.Problem05_AllElementsInTwoBinarySearchTrees.Node;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_AllElementsInTwoBinarySearchTreesTest {

    private final Problem05_AllElementsInTwoBinarySearchTrees testObject =
            new Problem05_AllElementsInTwoBinarySearchTrees();

    @Test
    void testGetAllElements() {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(0);
        root2.right = new Node(3);

        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 4);
        assertEquals(expected, testObject.getAllElements(root1, root2));
    }
}