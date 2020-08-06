package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_FindAllDuplicatesInArrayTest {

    private final Problem06_FindAllDuplicatesInArray testObject = new Problem06_FindAllDuplicatesInArray();

    @Test
    void testFindDuplicates() {
        int[] numbers = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, testObject.findDuplicates(numbers));
    }
}