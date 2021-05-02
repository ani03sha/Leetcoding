package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_CourseScheduleIIITest {

    private final Problem02_CourseScheduleIII testObject = new Problem02_CourseScheduleIII();

    @Test
    void testScheduleCourse() {
        int[][] courses = new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        assertEquals(3, testObject.scheduleCourse(courses));

        courses = new int[][]{{1, 2}};
        assertEquals(1, testObject.scheduleCourse(courses));

        courses = new int[][]{{3, 2}, {4, 3}};
        assertEquals(0, testObject.scheduleCourse(courses));
    }
}