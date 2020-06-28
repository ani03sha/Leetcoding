package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_ReconstructItineraryTest {

    private final Problem28_ReconstructItinerary testObject = new Problem28_ReconstructItinerary();

    @Test
    void testFindItinerary() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        List<String> expected = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");

        assertEquals(expected, testObject.findItinerary(tickets));

        tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));

        expected = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");

        assertEquals(expected, testObject.findItinerary(tickets));
    }
}