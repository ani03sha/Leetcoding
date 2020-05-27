package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
 * <p>
 * Each person may dislike some other people, and they should not go into the same group.
 * <p>
 * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
 * <p>
 * Return true if and only if it is possible to split everyone into two groups in this way.
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 2000
 * 0 <= dislikes.length <= 10000
 * 1 <= dislikes[i][j] <= N
 * dislikes[i][0] < dislikes[i][1]
 * There does not exist i != j for which dislikes[i] == dislikes[j].
 */
public class Problem27_PossibleBipartition {

    /**
     * @param N        - Number of members
     * @param dislikes - array defining which person dislikes other
     * @return - true, if the groups can be possible
     */
    public boolean possibleBipartition(int N, int[][] dislikes) {
        // Groups
        int[] groups = new int[N];
        // Initialize all the elements in the array with -1
        Arrays.fill(groups, -1);
        // Adjacency list
        ArrayList<Integer>[] adjacencyList = new ArrayList[N];
        // Create lists for each node
        for (int i = 0; i < N; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        // Color the neighboring nodes
        for (int[] p : dislikes) {
            adjacencyList[p[0] - 1].add(p[1] - 1);
            adjacencyList[p[1] - 1].add(p[0] - 1);
        }
        // Check the levels of the neighbors
        for (int i = 0; i < N; i++) {
            if (groups[i] == -1 && !dfs(adjacencyList, groups, i, 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(ArrayList<Integer>[] adjacencyList, int[] groups, int i, int j) {
        if (groups[i] == -1) {
            groups[i] = j;
        } else {
            return groups[i] == j;
        }
        for (Integer n : adjacencyList[i]) {
            if (!dfs(adjacencyList, groups, n, 1 - j)) {
                return false;
            }
        }
        return true;
    }
}
