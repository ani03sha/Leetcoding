package org.redquark.leetcode.challenge;

import java.util.Random;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same
 * probability of being chosen.
 * <p>
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently
 * without using extra space?
 */
public class Problem02_LinkedListRandomNode {

    private final Random random;
    private final Node head;

    public Problem02_LinkedListRandomNode(Node head) {
        this.random = new Random();
        this.head = head;
    }

    public int getRandom() {
        int count = 1;
        Node temp = head;
        int result = 0;
        while (temp != null) {
            if (random.nextInt(count) == 0) {
                result = temp.data;
            }
            count++;
            temp = temp.next;
        }
        return result;
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
