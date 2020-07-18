package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem18_CourseScheduleIITest {

    private final Problem18_CourseScheduleII testObject = new Problem18_CourseScheduleII();

    @Test
    void testFindOrder() {
        int[][] prerequisites = new int[][]{{1, 0}};
        int numCourses = 2;
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, testObject.findOrder(numCourses, prerequisites));

        prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        numCourses = 4;
        expected = new int[]{0, 2, 1, 3};
        assertArrayEquals(expected, testObject.findOrder(numCourses, prerequisites));

        prerequisites = new int[][]{{1, 0}, {0, 1}};
        numCourses = 2;
        expected = new int[0];
        assertArrayEquals(expected, testObject.findOrder(numCourses, prerequisites));
    }
}