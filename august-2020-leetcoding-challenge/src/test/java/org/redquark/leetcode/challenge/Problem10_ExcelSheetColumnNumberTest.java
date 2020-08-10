package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_ExcelSheetColumnNumberTest {

    private final Problem10_ExcelSheetColumnNumber testObject = new Problem10_ExcelSheetColumnNumber();

    @Test
    void testTitleToNumber() {
        assertEquals(1, testObject.titleToNumber("A"));
        assertEquals(27, testObject.titleToNumber("AA"));
        assertEquals(701, testObject.titleToNumber("ZY"));
    }
}