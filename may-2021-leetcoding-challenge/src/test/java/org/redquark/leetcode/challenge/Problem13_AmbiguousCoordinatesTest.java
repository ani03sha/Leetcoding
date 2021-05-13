package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_AmbiguousCoordinatesTest {

    private final Problem13_AmbiguousCoordinates testObject = new Problem13_AmbiguousCoordinates();

    @Test
    void testAmbiguousCoordinates() {
        String s = "(123)";
        List<String> expected = Arrays.asList("(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)");
        assertEquals(expected.size(), testObject.ambiguousCoordinates(s).size());

        s = "(00011)";
        expected = Arrays.asList("(0.001, 1)", "(0, 0.011)");
        assertEquals(expected.size(), testObject.ambiguousCoordinates(s).size());

        s = "(0123)";
        expected = Arrays.asList("(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)");
        assertEquals(expected.size(), testObject.ambiguousCoordinates(s).size());

        s = "(100)";
        expected = Collections.singletonList("(10, 0)");
        assertEquals(expected.size(), testObject.ambiguousCoordinates(s).size());
    }
}