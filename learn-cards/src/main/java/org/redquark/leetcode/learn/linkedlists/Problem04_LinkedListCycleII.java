package org.redquark.leetcode.learn.linkedlists;

public class Problem04_LinkedListCycleII {

    /**
     * @param head head of the liked list
     * @return - Node where cycle is present
     */
    public Node detectCycle(Node head) {
        // Base condition
        if (head == null || head.next == null) {
            // No cycle
            return null;
        }
        // Fast pointer
        Node fast = head;
        // Slow pointer
        Node slow = head;
        // Loop until we reach to the end of the list
        while (fast != null && fast.next != null) {
            // Move fast pointer two steps ahead
            fast = fast.next.next;
            // Move slow pointer one step ahead
            slow = slow.next;
            // If after some cycles, slow is equal to the fast then it means there is a cycle in the list
            if (fast == slow) {
                break;
            }
        }
        // At the end of the loop check if slow and fast are equal
        if (slow == fast) {
            // Move slow again to the head and fast will be at its position
            slow = head;
            // Now loop until slow does not become equal to fast
            while (slow != fast) {
                // Move both slow and fast one step ahead
                slow = slow.next;
                fast = fast.next;
            }
            // Slow will be the first node in the cycle
            return slow;
        } else {
            // If slow and fast and not equal then there is no cycle, hence return null
            return null;
        }
    }

    /**
     * This class represents each node in the linked list
     */
    static class Node {
        // Data to be stored in the node
        final int data;
        // Next pointer of the node
        Node next;

        /**
         * Constructor that will create a new node for the linked list
         */
        Node(int data) {
            this.data = data;
        }
    }
}
