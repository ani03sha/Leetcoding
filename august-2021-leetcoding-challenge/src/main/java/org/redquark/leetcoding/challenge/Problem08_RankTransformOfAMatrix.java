package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 * <p>
 * iven an m x n matrix, return a new matrix answer where answer[row][col] is the rank of matrix[row][col].
 * <p>
 * The rank is an integer that represents how large an element is compared to other elements.
 * It is calculated using the following rules:
 * <p>
 * The rank is an integer starting from 1.
 * If two elements p and q are in the same row or column, then:
 * If p < q then rank(p) < rank(q)
 * If p == q then rank(p) == rank(q)
 * If p > q then rank(p) > rank(q)
 * The rank should be as small as possible.
 * It is guaranteed that answer is unique under the given rules.
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 500
 * -10^9 <= matrix[row][col] <= 10^9
 */
public class Problem08_RankTransformOfAMatrix {

    public int[][] matrixRankTransform(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of a matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Link rows to columns and columns to rows
        Map<Integer, Map<Integer, List<Integer>>> graphs = new HashMap<>();
        // Loop through each cell of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Current element
                int current = matrix[i][j];
                // If not initialized, initialize it
                if (!graphs.containsKey(current)) {
                    graphs.put(current, new HashMap<>());
                }
                // Get the map associated with the current element
                Map<Integer, List<Integer>> graph = graphs.get(current);
                // Map current row and column
                if (!graph.containsKey(i)) {
                    graph.put(i, new ArrayList<>());
                }
                if (!graph.containsKey(~j)) {
                    graph.put(~j, new ArrayList<>());
                }
                // Link i to j, j to i
                graph.get(i).add(~j);
                graph.get(~j).add(i);
            }
        }
        // Store the keys in sorted order
        Map<Integer, List<List<int[]>>> valueToIndex = new TreeMap<>();
        // For visited cells
        int[][] visited = new int[m][n];
        // Loop for all the cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 1) {
                    continue;
                }
                visited[i][j] = 1;
                // Current element
                int current = matrix[i][j];
                // Get current graph
                Map<Integer, List<Integer>> graph = graphs.get(current);
                // Store visited rows and columns
                Set<Integer> rowColumns = new HashSet<>();
                rowColumns.add(i);
                rowColumns.add(~j);
                // Start BFS
                Queue<Integer> nodes = new LinkedList<>();
                nodes.offer(i);
                nodes.offer(~j);
                while (!nodes.isEmpty()) {
                    int node = nodes.poll();
                    for (int rowColumn : graph.get(node)) {
                        if (!rowColumns.contains(rowColumn)) {
                            rowColumns.add(rowColumn);
                            nodes.offer(rowColumn);
                        }
                    }
                }
                // Transform row columns into points
                List<int[]> points = new ArrayList<>();
                for (int rowColumn : rowColumns) {
                    for (int k : graph.get(rowColumn)) {
                        if (k >= 0) {
                            points.add(new int[]{k, ~rowColumn});
                            visited[k][~rowColumn] = 1;
                        } else {
                            points.add(new int[]{rowColumn, ~k});
                            visited[rowColumn][~k] = 1;
                        }
                    }
                }
                if (!valueToIndex.containsKey(current)) {
                    valueToIndex.put(current, new ArrayList<>());
                }
                valueToIndex.get(current).add(points);
            }
        }
        // Matrix to store ranks
        int[][] ranks = new int[m][n];
        // To represent maximum rank in rows
        int[] maxRowRanks = new int[m];
        // To represent minimum rank in columns
        int[] maxColumnRanks = new int[n];
        // For all the keys in valuesToIndex
        for (int current : valueToIndex.keySet()) {
            // Update connected points with same value
            for (List<int[]> points : valueToIndex.get(current)) {
                int rank = 1;
                for (int[] point : points) {
                    rank = Math.max(rank, Math.max(maxRowRanks[point[0]], maxColumnRanks[point[1]]) + 1);
                }
                for (int[] point : points) {
                    ranks[point[0]][point[1]] = rank;
                    maxRowRanks[point[0]] = Math.max(maxRowRanks[point[0]], rank);
                    maxColumnRanks[point[1]] = Math.max(maxColumnRanks[point[1]], rank);
                }
            }
        }
        return ranks;
    }
}
