package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given equations in the format A / B = k, where A and B are variables represented as strings,
 * and k is a real number (floating-point number). Given some queries, return the answers.
 * If the answer does not exist, return -1.0.
 * <p>
 * The input is always valid. You may assume that evaluating the queries will result in no division by
 * zero and there is no contradiction.
 * <p>
 * Constraints:
 * <p>
 * - 1 <= equations.length <= 20
 * - equations[i].length == 2
 * - 1 <= equations[i][0], equations[i][1] <= 5
 * - values.length == equations.length
 * - 0.0 < values[i] <= 20.0
 * - 1 <= queries.length <= 20
 * - queries[i].length == 2
 * - 1 <= queries[i][0], queries[i][1] <= 5
 * - equations[i][0], equations[i][1], queries[i][0], queries[i][1] consist of lower case English letters and digits.
 */
public class Problem27_EvaluateDivision {

    /**
     * @param equations - List of variables
     * @param values    - Array of values of equations
     * @param queries   - List of queries
     * @return - result of queries
     */
    public double[] calcEquation(List<List<String>> equations, double[] values,
                                 List<List<String>> queries) {
        // Create a graph from the equations and values
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        // Resultant array
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            result[i] = getPathWeight(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(),
                    graph);
        }
        return result;
    }

    private double getPathWeight(String start, String end, HashSet<Object> visited,
                                 Map<String, Map<String, Double>> graph) {
        // Rejection case
        if (!graph.containsKey(start)) {
            return -1.0;
        }
        // Accepting case
        if (graph.get(start).containsKey(end)) {
            return graph.get(start).get(end);
        }
        visited.add(start);
        // For other queries
        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            if (!visited.contains(neighbor.getKey())) {
                double productWeight = getPathWeight(neighbor.getKey(), end, visited, graph);
                if (productWeight != -1.0) {
                    return neighbor.getValue() * productWeight;
                }
            }
        }
        return -1.0;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> valueGraph = new HashMap<>();
        // Nodes
        String u, v;
        for (int i = 0; i < equations.size(); i++) {
            u = equations.get(i).get(0);
            v = equations.get(i).get(1);
            valueGraph.putIfAbsent(u, new HashMap<>());
            valueGraph.get(u).put(v, values[i]);
            valueGraph.putIfAbsent(v, new HashMap<>());
            valueGraph.get(v).put(u, 1 / values[i]);
        }
        return valueGraph;
    }
}

