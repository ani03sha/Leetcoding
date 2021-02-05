package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_SimplifyPathTest {

    private final Problem05_SimplifyPath testObject = new Problem05_SimplifyPath();

    @Test
    void testSimplifyPath() {
        assertEquals("/home", testObject.simplifyPath("/home/"));
        assertEquals("/", testObject.simplifyPath("/../"));
        assertEquals("/home/foo", testObject.simplifyPath("/home//foo"));
        assertEquals("/c", testObject.simplifyPath("/a/./b/../../c/"));
    }
}