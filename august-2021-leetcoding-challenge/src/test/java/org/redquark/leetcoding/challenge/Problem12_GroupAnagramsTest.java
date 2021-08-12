package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_GroupAnagramsTest {

    private final Problem12_GroupAnagrams testObject = new Problem12_GroupAnagrams();

    @Test
    void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Collections.singletonList("bat"));
        expected.add(Arrays.asList("tan", "nat"));
        assertEquals(expected, testObject.groupAnagrams(strs));

        strs = new String[]{""};
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(""));
        assertEquals(expected, testObject.groupAnagrams(strs));

        strs = new String[]{"a"};
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("a"));
        assertEquals(expected, testObject.groupAnagrams(strs));
    }
}