package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_ExpressionAddOperatorsTest {

    private final Problem18_ExpressionAddOperators testObject = new Problem18_ExpressionAddOperators();

    @Test
    void testAddOperators() {
        String num = "123";
        int target = 6;
        List<String> expected = Arrays.asList("1*2*3", "1+2+3");
        assertEquals(expected, testObject.addOperators(num, target));

        num = "232";
        target = 8;
        expected = Arrays.asList("2*3+2", "2+3*2");
        assertEquals(expected, testObject.addOperators(num, target));

        num = "105";
        target = 5;
        expected = Arrays.asList("1*0+5", "10-5");
        assertEquals(expected, testObject.addOperators(num, target));

        num = "00";
        target = 0;
        expected = Arrays.asList("0*0", "0+0", "0-0");
        assertEquals(expected, testObject.addOperators(num, target));

        num = "3456237490";
        target = 9191;
        expected = Collections.emptyList();
        assertEquals(expected, testObject.addOperators(num, target));
    }
}