package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem29_CourseScheduleTest {

    private final Problem29_CourseSchedule testObject = new Problem29_CourseSchedule();

    @Test
    void testCanFinish() {
        int[][] prerequisites = new int[][]{{1, 0}};
        assertTrue(testObject.canFinish(2, prerequisites));

        prerequisites = new int[][]{{1, 0}, {0, 1}};
        assertFalse(testObject.canFinish(2, prerequisites));
    }
}