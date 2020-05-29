package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * <p>
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices.
 * You may assume that there are no duplicate edges in the input prerequisites.
 * 1 <= numCourses <=
 */
public class Problem29_CourseSchedule {

    /**
     * @param numCourses    - number of courses
     * @param prerequisites - course prerequisite array
     * @return - true, if the course can be finished
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Base condition
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }
        // Track visited courses
        int[] visited = new int[numCourses];
        // Map will store that which course depends on which course
        Map<Integer, List<Integer>> courseMap = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (courseMap.containsKey(prerequisite[1])) {
                courseMap.get(prerequisite[1]).add(prerequisite[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisite[0]);
                courseMap.put(prerequisite[1], list);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (dfs(courseMap, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> courseMap, int[] visited, int i) {
        if (visited[i] == -1) {
            return true;
        }
        if (visited[i] == 1) {
            return false;
        }
        visited[i] = -1;
        if (courseMap.containsKey(i)) {
            for (int j : courseMap.get(i)) {
                if (dfs(courseMap, visited, j)) {
                    return true;
                }
            }
        }
        visited[i] = 1;
        return false;
    }
}
