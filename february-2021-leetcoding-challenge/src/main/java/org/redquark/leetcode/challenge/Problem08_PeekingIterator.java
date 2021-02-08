package org.redquark.leetcode.challenge;

import java.util.Iterator;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an Iterator class interface with methods: next() and hasNext(), design and implement a
 * PeekingIterator that support the peek() operation -- it essentially peek() at the element
 * that will be returned by the next call to next().
 */
public class Problem08_PeekingIterator implements Iterator<Integer> {

    // Store the incoming iterator object
    private final Iterator<Integer> incomingIterator;
    // Point to the next of the iterator object at a given time
    private Integer next;
    // Flag to check if there are more elements in the iterator object
    private boolean hasMoreElements;

    Problem08_PeekingIterator(Iterator<Integer> iterator) {
        this.incomingIterator = iterator;
        // This method updates the next member to point to the next element
        // of the iterator object
        advanceIterator();
    }

    public Integer peek() {
        return next;
    }

    private void advanceIterator() {
        // If there are elements left
        if (incomingIterator.hasNext()) {
            next = incomingIterator.next();
        } else {
            hasMoreElements = false;
        }
    }

    @Override
    public boolean hasNext() {
        return hasMoreElements;
    }

    @Override
    public Integer next() {
        // Cached result
        Integer cachedValue = next;
        // Update the next to point to next of iterator by invoking advanceIterator
        advanceIterator();
        return cachedValue;
    }
}
