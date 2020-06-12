package org.redquark.leetcode.challenge;

import java.util.*;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a data structure that supports all following operations in average O(1) time.
 * <p>
 * 1. insert(val): Inserts an item val to the set if not already present.
 * 2. remove(val): Removes an item val from the set if present.
 * 3. getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 */
public class Problem12_RandomizedSet {

    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public Problem12_RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified
     * element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        int index = list.size();
        list.add(val);
        map.put(val, index);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        if (index != list.size() - 1) {
            int tail = list.get(list.size() - 1);
            list.set(index, tail);
            map.put(tail, index);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        if (list.isEmpty()) {
            return 0;
        }
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
