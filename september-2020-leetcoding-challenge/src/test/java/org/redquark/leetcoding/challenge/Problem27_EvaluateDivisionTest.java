package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem27_EvaluateDivisionTest {

    private final Problem27_EvaluateDivision testObject = new Problem27_EvaluateDivision();

    @Test
    void testCalcEquation() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));
        double[] expected = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};
        assertArrayEquals(expected, testObject.calcEquation(equations, values, queries));
    }
}