package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem31_FlattenAMultilevelDoublyLinkedList.Node;

class Problem31_FlattenAMultilevelDoublyLinkedListTest {

    private final Problem31_FlattenAMultilevelDoublyLinkedList testObject = new Problem31_FlattenAMultilevelDoublyLinkedList();

    @Test
    void testFlatten() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        one.next = two;
        two.prev = one;
        two.next = three;
        three.next = four;
        three.prev = two;
        three.child = seven;
        four.prev = three;
        four.next = five;
        five.prev = four;
        five.next = six;
        six.prev = five;
        seven.next = eight;
        eight.prev = seven;
        eight.next = nine;
        nine.prev = eight;
        nine.next = ten;
        ten.prev = nine;
        eight.child = eleven;
        eleven.next = twelve;
        twelve.prev = eleven;
        Node expected = testObject.flatten(one);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(7, expected.next.next.next.val);
        assertEquals(8, expected.next.next.next.next.val);
        assertEquals(11, expected.next.next.next.next.next.val);
        assertEquals(12, expected.next.next.next.next.next.next.val);
        assertEquals(9, expected.next.next.next.next.next.next.next.val);
        assertEquals(10, expected.next.next.next.next.next.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.next.next.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.next.next.next.next.next.next.val);
        assertEquals(6, expected.next.next.next.next.next.next.next.next.next.next.next.val);
    }
}