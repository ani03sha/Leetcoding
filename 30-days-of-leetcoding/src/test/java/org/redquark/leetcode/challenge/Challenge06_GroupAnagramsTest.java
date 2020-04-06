package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Challenge06_GroupAnagramsTest {

    private Challenge06_GroupAnagrams testObject = new Challenge06_GroupAnagrams();

    @Test
    void group() {
        String[] items = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] expectedArray = new String[][]{{"eat", "tea", "ate"}, {"tan", "nat"}, {"bat"}};
        List<List<String>> expected = Arrays.stream(expectedArray).map(Arrays::asList).collect(Collectors.toList());
        List<List<String>> actual = testObject.group(items);
        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual) && actual.containsAll(expected));

        items = new String[]{"cat", "dog", "tac", "god", "act"};
        expectedArray = new String[][]{{"cat", "tac", "act"}, {"dog", "god"}};
        expected = Arrays.stream(expectedArray).map(Arrays::asList).collect(Collectors.toList());
        actual = testObject.group(items);
        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual) && actual.containsAll(expected));
    }
}