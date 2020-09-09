package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem09_CompareVersionNumbersTest {

    private final Problem09_CompareVersionNumbers testObject =
            new Problem09_CompareVersionNumbers();

    @Test
    void testCompareVersion() {
        String version1 = "0.1";
        String version2 = "1.1";
        assertEquals(-1, testObject.compareVersion(version1, version2));

        version1 = "1.0.1";
        version2 = "1";
        assertEquals(1, testObject.compareVersion(version1, version2));

        version1 = "7.5.2.4";
        version2 = "7.5.3";
        assertEquals(-1, testObject.compareVersion(version1, version2));

        version1 = "1.0";
        version2 = "1.0.0";
        assertEquals(0, testObject.compareVersion(version1, version2));

        version1 = "1.01";
        version2 = "1.001";
        assertEquals(0, testObject.compareVersion(version1, version2));
    }
}