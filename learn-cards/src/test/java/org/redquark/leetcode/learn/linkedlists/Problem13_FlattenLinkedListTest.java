package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.redquark.leetcode.learn.linkedlists.Problem13_FlattenLinkedList.Node;

class Problem13_FlattenLinkedListTest {

    private final Problem13_FlattenLinkedList testObject = new Problem13_FlattenLinkedList();

    @Test
    void flatten() {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        Node n6 = new Node(7);
        Node n7 = new Node(8);
        Node n8 = new Node(9);
        Node n9 = new Node(10);

        Node n10 = new Node(11);
        Node n11 = new Node(12);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.child = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        n7.child = n10;
        n10.next = n11;

        head = testObject.flatten(head);

        int[] listArray = new int[12];
        for (int i = 0; i < 12; i++) {
            listArray[i] = head.data;
            head = head.next;
        }

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6}, listArray);
    }
}