package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcode.challenge.Problem11_FindMedianFromDataStream.MedianFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_FindMedianFromDataStreamTest {

    private final MedianFinder testObject = new MedianFinder();

    @Test
    void test() {
        testObject.addNum(1);
        testObject.addNum(2);
        assertEquals(1.5, testObject.findMedian());
        testObject.addNum(3);
        assertEquals(2.0, testObject.findMedian());
    }
}