package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem09_SerializeAndDeserializeBST.Node;

class Problem09_SerializeAndDeserializeBSTTest {

    private final Problem09_SerializeAndDeserializeBST testObject = new Problem09_SerializeAndDeserializeBST();

    private Node root;

    @BeforeEach
    void setUp() {
        root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
    }

    @Test
    void testSerialize() {
        assertEquals("2#1#3#", testObject.serialize(root));
    }

    @Test
    void testDeserialize() {
        Node deserializedRoot = testObject.deserialize("2#1#3#");
        assertEquals(2, deserializedRoot.data);
        assertEquals(1, deserializedRoot.left.data);
        assertEquals(3, deserializedRoot.right.data);
    }
}