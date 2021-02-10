package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * A linked list of length n is given such that each node contains an additional random pointer,
 * which could point to any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes,
 * where each new node has its value set to the value of its corresponding original node.
 * <p>
 * Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for
 * the corresponding two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 * <p>
 * The linked list is represented in the input/output as a list of n nodes.
 * Each node is represented as a pair of [val, random_index] where:
 * <p>
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to,
 * or null if it does not point to any node.
 * <p>
 * Your code will only be given the head of the original linked list.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 1000
 * -10000 <= Node.val <= 10000
 * Node.random is null or is pointing to some node in the linked list.
 */
public class Problem10_CopyListWithRandomPointer {

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
            Node node = new Node(temp.val);
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
        final int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }
}
