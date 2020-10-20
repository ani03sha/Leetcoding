package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem20_CloneGraph.Node;

class Problem20_CloneGraphTest {

    private final Problem20_CloneGraph testObject = new Problem20_CloneGraph();

    @Test
    void testCloneGraph() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        first = new Node(1, Arrays.asList(second, fourth));
        second = new Node(2, Arrays.asList(first, third));
        third = new Node(3, Arrays.asList(second, fourth));
        fourth = new Node(4, Arrays.asList(first, third));

        Node copy = testObject.cloneGraph(first);
        assertEquals(2, copy.neighbors.get(0).data);
        assertEquals(4, copy.neighbors.get(1).data);
    }
}