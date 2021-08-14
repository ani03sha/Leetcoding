package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_RemoveBoxesTest {

    private final Problem14_RemoveBoxes testObject = new Problem14_RemoveBoxes();

    @Test
    void testRemoveBoxes() {
        int[] boxes = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};
        assertEquals(23, testObject.removeBoxes(boxes));

        boxes = new int[]{1, 1, 1};
        assertEquals(9, testObject.removeBoxes(boxes));

        boxes = new int[]{1};
        assertEquals(1, testObject.removeBoxes(boxes));
    }
}