package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem17_RobotBoundedInCircleTest {

    private final Problem17_RobotBoundedInCircle testObject = new Problem17_RobotBoundedInCircle();

    @Test
    void testIsRobotBounded() {
        assertTrue(testObject.isRobotBounded("GGLLGG"));
        assertFalse(testObject.isRobotBounded("GG"));
        assertTrue(testObject.isRobotBounded("GL"));
    }
}