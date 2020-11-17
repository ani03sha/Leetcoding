package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_MirrorReflectionTest {

    private final Problem17_MirrorReflection testObject = new Problem17_MirrorReflection();

    @Test
    void testMirrorReflection() {
        assertEquals(2, testObject.mirrorReflection(2, 1));
    }
}