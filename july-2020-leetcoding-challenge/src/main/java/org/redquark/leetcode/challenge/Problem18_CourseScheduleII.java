package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * There are a total of n courses you have to take, labeled from 0 to n-1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is
 * expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should
 * take to finish all courses.
 * <p>
 * There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all
 * courses, return an empty array.
 * <p>
 * Note:
 * <p>
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices.
 * You may assume that there are no duplicate edges in the input prerequisites.
 */
public class Problem18_CourseScheduleII {

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
