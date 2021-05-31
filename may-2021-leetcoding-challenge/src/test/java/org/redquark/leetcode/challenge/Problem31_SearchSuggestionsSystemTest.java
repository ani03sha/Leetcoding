package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_SearchSuggestionsSystemTest {

    private final Problem31_SearchSuggestionsSystem testObject = new Problem31_SearchSuggestionsSystem();

    @Test
    void testSuggestedProducts() {
        String[] products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));

        products = new String[]{"havana"};
        searchWord = "havana";
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));

        products = new String[]{"havana"};
        searchWord = "tatiana";
        expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));
    }
}