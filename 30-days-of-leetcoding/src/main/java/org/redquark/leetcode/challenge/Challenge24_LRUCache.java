package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Design and implement a data structure for Least Recently Used (LRU) cache.
 * It should support the following operations: get and put.
 * <p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache,
 * otherwise return -1.
 * <p>
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached
 * its capacity, it should invalidate the least recently used item before inserting a new item.
 * <p>
 * The cache is initialized with a positive capacity.
 * <p>
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 */
public class Challenge24_LRUCache {

    /**
     * This class represents LRU cache
     */
    static class LRUCache {

        // Dummy head and tail nodes
        final Node head = new Node();
        final Node tail = new Node();
        // Capacity of the cache
        int capacity;
        // Cache map - represents cache
        Map<Integer, Node> cache;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<>(capacity);
            // Connecting head and tail to each other
            head.next = tail;
            tail.previous = head;
        }

        public int get(int key) {
            // Get the node from the map
            Node node = cache.get(key);
            // If the node exists
            if (node != null) {
                // Get the value stored in the node
                int value = node.value;
                // Remove and add the node
                remove(node);
                add(node);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            // Get the node from the given key
            Node node = cache.get(key);
            // Check if the node already exists
            if (node != null) {
                node.value = value;
                // Accessing a node is considered to update LRU cache
                // Remove the node
                remove(node);
                // Add the node
                add(node);
            } else {
                if (cache.size() == capacity) {
                    // Remove from the map
                    cache.remove(tail.previous.key);
                    // Remove from the linked list
                    remove(tail.previous);
                }
                // Create a new node
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;
                // Add to map
                cache.put(key, newNode);
                // Add to linked list
                add(newNode);
            }
        }

        /**
         * This method will remove the node to the front of the linked list
         *
         * @param node - node to be added
         */
        private void add(Node node) {
            Node headNext = head.next;
            head.next = node;
            node.previous = head;
            node.next = headNext;
            headNext.previous = node;
        }

        /**
         * This method will remove the node from the linked list
         *
         * @param node - node to be removed
         */
        private void remove(Node node) {
            Node next = node.next;
            Node previous = node.previous;
            previous.next = next;
            next.previous = previous;
        }

        static class Node {
            int key;
            int value;
            Node previous;
            Node next;
        }
    }
}
