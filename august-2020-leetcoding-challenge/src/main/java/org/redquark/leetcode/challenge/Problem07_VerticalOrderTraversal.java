package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree, return the vertical order traversal of its nodes values.
 * <p>
 * For each node at position (X, Y), its left and right children respectively will be at positions
 * (X-1, Y-1) and (X+1, Y-1).
 * <p>
 * Running a vertical line from X = -infinity to X = +infinity, whenever the vertical line touches
 * some nodes, we report the values of the nodes in order from top to bottom (decreasing Y coordinates).
 * <p>
 * If two nodes have the same position, then the value of the node that is reported first is the value
 * that is smaller.
 * <p>
 * Return an list of non-empty reports in order of X coordinate.  Every report will have a list of
 * values of nodes.
 * <p>
 * Note:
 * <p>
 * The tree will have between 1 and 1000 nodes.
 * Each node's value will be between 0 and 1000.
 */
public class Problem07_VerticalOrderTraversal {

    /**
     * @param root - root of the binary tree
     * @return list of the vertical order traversal
     */
    public List<List<Integer>> verticalTraversal(Node root) {
        // Resultant list
        List<List<Integer>> result = new ArrayList<>();
        // Base condition
        if (root == null) {
            return result;
        }
        // Map that will store the list of elements at each x index
        Map<Integer, List<Point>> map = new HashMap<>();
        // Queue that will store the nodes at each index
        Queue<Point> queue = new LinkedList<>();
        // Add first level or root
        queue.add(new Point(0, 0, root));
        // Minimum and maximum values of x coordinate
        int min = 0;
        int max = 0;
        // Loop until the list is empty
        while (!queue.isEmpty()) {
            // Get the current point
            Point current = queue.poll();
            min = Math.min(min, current.x);
            max = Math.max(max, current.x);
            // Add values in the map
            map.putIfAbsent(current.x, new ArrayList<>());
            map.get(current.x).add(current);
            // Check if the current node has left or right nodes
            if (current.node.left != null) {
                queue.add(new Point(current.x - 1, current.y - 1, current.node.left));
            }
            if (current.node.right != null) {
                queue.add(new Point(current.x + 1, current.y - 1, current.node.right));
            }
        }
        // Loop from min to max values
        for (int i = min; i <= max; i++) {
            // Get the list at the current x index
            List<Point> points = map.get(i);
            // Sort this list with custom comparator
            points.sort((a, b) -> a.y == b.y ? a.node.data - b.node.data : b.y - a.y);
            // Create list for each index
            List<Integer> currentList = new ArrayList<>();
            for (Point p : points) {
                currentList.add(p.node.data);
            }
            result.add(currentList);
        }
        return result;
    }

    /**
     * This class will represent each tree node in a cartesian coordinate system
     */
    static class Point {
        int x;
        int y;
        Node node;

        Point(int x, int y, Node node) {
            this.x = x;
            this.y = y;
            this.node = node;
        }
    }

    /**
     * This class represents each node of the binary tree
     */
    static class Node {
        final int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
