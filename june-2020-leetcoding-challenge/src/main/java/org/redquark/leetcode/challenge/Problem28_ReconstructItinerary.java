package org.redquark.leetcode.challenge;

import java.util.*;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to],
 * reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK.
 * Thus, the itinerary must begin with JFK.
 * <p>
 * Note:
 * <p>
 * If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical
 * order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order
 * than ["JFK", "LGB"].
 * <p>
 * All airports are represented by three capital letters (IATA code).
 * You may assume all tickets form at least one valid itinerary.
 * One must use all the tickets once and only once.
 */
public class Problem28_ReconstructItinerary {

    /**
     * @param tickets - 2D array of tickets
     * @return updated itinerary
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        // Adjacency list
        Map<String, PriorityQueue<String>> flights = new HashMap<>();
        // Loop for all the elements
        for (List<String> ticket : tickets) {
            if (!flights.containsKey(ticket.get(0))) {
                flights.put(ticket.get(0), new PriorityQueue<>());
            }
            flights.get(ticket.get(0)).add(ticket.get(1));
        }
        List<String> result = new ArrayList<>();
        helper(result, "JFK", flights);
        return result;
    }

    private void helper(List<String> result, String port, Map<String, PriorityQueue<String>> flights) {
        PriorityQueue<String> priorityQueue = flights.get(port);
        while (priorityQueue != null && !priorityQueue.isEmpty()) {
            helper(result, priorityQueue.poll(), flights);
        }
        result.add(0, port);
    }
}
