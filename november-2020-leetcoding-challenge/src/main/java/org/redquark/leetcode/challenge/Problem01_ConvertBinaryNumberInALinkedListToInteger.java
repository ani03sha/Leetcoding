package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * Constraints:
 * <p>
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 */
public class Problem01_ConvertBinaryNumberInALinkedListToInteger {

    /**
     * @param head - head of the linked list`
     * @return - equivalent decimal value
     */
    public int getDecimalValue(Node head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) + head.data;
            head = head.next;
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
