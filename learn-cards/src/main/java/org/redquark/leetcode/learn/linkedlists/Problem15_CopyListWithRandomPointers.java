package org.redquark.leetcode.learn.linkedlists;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * A linked list is given such that each node contains an additional random pointer which could point
 * to any node in the list or null.
 * <p>
 * Return a deep copy of the list.
 * <p>
 * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as
 * a pair of [val, random_index] where:
 * <p>
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if
 * it does not point to any node.
 */
public class Problem15_CopyListWithRandomPointers {

    /**
     * @param head - head of the original linked list
     * @return head of the cloned linked list
     * <p>
     * Algorithm:
     * 1. Create a clone of the linked list
     * 2. While creating the clone, copy original node and cloned node in the map
     * 3. Now loop again on original linked list and get the random from the map
     * 4. Link random of the node in the cloned list to the desginated node
     */
    public Node copyRandomList(Node head) {
        // Base condition
        if (head == null) {
            return null;
        }
        // This map will store the pair of original and cloned node
        Map<Node, Node> nodeMap = new HashMap<>();
        // Head of the clone
        Node cloneHead = null;
        // Reference of head of the original linked list
        Node temp = head;
        // Reference of the head of the clone
        Node cloneTemp = cloneHead;
        // Loop through the entire original linked list
        while (temp != null) {
            // Create a new node
            Node node = new Node(temp.data);
            if (cloneHead == null) {
                cloneHead = node;
                cloneTemp = cloneHead;
            } else {
                cloneTemp.next = node;
                cloneTemp = node;
            }
            // Now put the pair of original and cloned node
            nodeMap.put(temp, cloneTemp);
            temp = temp.next;
        }
        temp = head;
        cloneTemp = cloneHead;
        // Loop again for the random pointers
        while (temp != null) {
            if (temp.random != null) {
                // Linking random from the map
                cloneTemp.random = nodeMap.get(temp.random);
            }
            temp = temp.next;
            cloneTemp = cloneTemp.next;
        }
        return cloneHead;
    }

    static class Node {
        final int data;
        Node random;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
