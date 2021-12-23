package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array
 * prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take
 * course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any
 * of them. If it is impossible to finish all courses, return an empty array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * ai != bi
 * All the pairs [ai, bi] are distinct.
 */
public class Problem23_CourseScheduleII {

    @SuppressWarnings("unchecked")
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Create adjacency list for all the courses
        List<Integer>[] adjacencyList = new ArrayList[numCourses];
        // Initialize all the lists
        for (int i = 0; i < numCourses; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        // Loop for the prerequisites
        for (int[] courses : prerequisites) {
            adjacencyList[courses[1]].add(courses[0]);
        }
        Stack<Integer> stack = new Stack<>();
        // Visited array
        int[] visited = new int[numCourses];
        // Loop for all courses
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && dfs(i, adjacencyList, stack, visited)) {
                return new int[0];
            }
        }
        Collections.reverse(stack);
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean dfs(int i, List<Integer>[] adjacencyList, Stack<Integer> stack, int[] visited) {
        // Make the current node is visited
        visited[i] = 1;
        // Check for the adjacency list
        for (int n : adjacencyList[i]) {
            if (visited[n] == 1) {
                return true;
            }
            if (visited[n] == 0 && dfs(n, adjacencyList, stack, visited)) {
                return true;
            }
        }
        visited[i] = 2;
        stack.push(i);
        return false;
    }
}
