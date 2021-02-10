package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem10_CopyListWithRandomPointer.Node;

class Problem10_CopyListWithRandomPointerTest {

    private final Problem10_CopyListWithRandomPointer testObject =
            new Problem10_CopyListWithRandomPointer();


    @Test
    void testCopyRandomList() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head.random = n3;
        head.next.random = n4;
        n4.random = head;

        Node cloneHead = testObject.copyRandomList(head);

        assertEquals(1, cloneHead.val);
        assertEquals(4, cloneHead.random.val);
        assertEquals(5, cloneHead.next.random.val);
        assertEquals(1, cloneHead.next.next.next.next.random.val);
    }
}