package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.learn.linkedlists.Problem05_Intersection.Node;

class Problem05_IntersectionTest {

    private final Problem05_Intersection testObject = new Problem05_Intersection();

    @Test
    void getIntersectionNode() {
        // Create some nodes
        Node headA = new Node(1);
        Node headB = new Node(6);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(8);

        // Create linked lists
        headA.next = n2;
        headA.next.next = n3;
        headA.next.next.next = n4;
        headA.next.next.next.next = n5;
        headB.next = n5;
        headB.next.next = n6;

        assertEquals(7, testObject.getIntersectionNode(headA, headB).data);
    }
}