package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author Anirudh sharma
 * <p>
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 * <p>
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= val <= 2^31 - 1
 * At most 2 * 10^5 calls will be made to insert, remove, and getRandom.
 * There will be at least one element in the data structure when getRandom is called.
 */
public class Problem21_InsertDeleteGetRandomO1 {

    static class RandomizedSet {
        // List to store the elements to be inserted
        List<Integer> elements;
        // Map to maintain the mapping of inserted elements
        // with the size of the list
        Map<Integer, Integer> mappings;

        public RandomizedSet() {
            elements = new ArrayList<>();
            mappings = new HashMap<>();
        }

        public boolean insert(int val) {
            // Check if element already exists in the data structure
            if (mappings.containsKey(val)) {
                return false;
            }
            // Add the mapping
            mappings.put(val, elements.size());
            // Add element to the end of the list
            elements.add(val);
            return true;
        }

        public boolean remove(int val) {
            // Check if element is present in the map or not
            if (!mappings.containsKey(val)) {
                return false;
            }
            // Get the index where the given value is stored
            int index = mappings.get(val);
            // If this index is not the last one in the list, we
            // will swap the element at last index with this value
            if (index < elements.size() - 1) {
                int last = elements.get(elements.size() - 1);
                elements.set(index, last);
                mappings.put(last, index);
            }
            // Remove the value from the mappings
            mappings.remove(val);
            // Remove the last element from the elements list
            elements.remove(elements.size() - 1);
            return true;
        }

        public int getRandom() {
            return elements.get(new Random().nextInt(elements.size()));
        }
    }
}
