package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * - put(key, value) : Insert a (key, value) pair into the HashMap.
 * If the value already exists in the HashMap, update the value.
 * - get(key): Returns the value to which the specified key is mapped, or -1 if
 * this map contains no mapping for the key.
 * - remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 * <p>
 * Note:
 * <p>
 * All keys and values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashMap library.
 */
public class Problem07_DesignHashMap {

    static class MyHashMap {

        // Bucket for each entry
        private final int[] entries;

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            entries = new int[1000001];
            Arrays.fill(entries, -1);
        }

        /**
         * Value will always be non-negative.
         */
        public void put(int key, int value) {
            entries[key] = value;
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map
         * contains no mapping for the key
         */
        public int get(int key) {
            return entries[key];
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            entries[key] = -1;
        }
    }
}
