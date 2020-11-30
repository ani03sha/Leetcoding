package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 * <p>
 * A city's skyline is the outer contour of the silhouette formed by all the buildings
 * in that city when viewed from a distance.
 * <p>
 * Now suppose you are given the locations and height of all the buildings, write a
 * program to output the skyline formed by these buildings collectively
 * <p>
 * The geometric information of each building is represented by a triplet of integers
 * [Li, Ri, Hi], where Li and Ri are the x coordinates of the left and right edge of
 * the ith building, respectively, and Hi is its height.
 * It is guaranteed that 0 ≤ Li, Ri ≤ INT_MAX, 0 < Hi ≤ INT_MAX, and Ri - Li > 0.
 * You may assume all buildings are perfect rectangles grounded on an absolutely
 * flat surface at height 0.
 * <p>
 * For instance, the dimensions of all buildings in Figure A are recorded as:
 * [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
 * <p>
 * The output is a list of "key points" (red dots in Figure B) in the format of
 * [ [x1,y1], [x2, y2], [x3, y3], ... ] that uniquely defines a skyline.
 * <p>
 * A key point is the left endpoint of a horizontal line segment.
 * Note that the last key point, where the rightmost building ends, is merely used
 * to mark the termination of the skyline, and always has zero height.
 * <p>
 * Also, the ground in between any two adjacent buildings should be considered part of
 * the skyline contour.
 * <p>
 * For instance, the skyline in Figure B should be represented as:[ [2 10], [3 15],
 * [7 12], [12 0], [15 10], [20 8], [24, 0] ].
 * <p>
 * Notes:
 * <p>
 * The number of buildings in any input list is guaranteed to be in the range [0, 10000].
 * The input list is already sorted in ascending order by the left x position Li.
 * The output list must be sorted by the x position.
 * There must be no consecutive horizontal lines of equal height in the output skyline.
 * For instance, [...[2 3], [4 5], [7 5], [11 5], [12 7]...] is not acceptable;
 * the three lines of height 5 should be merged into one in the final output as such:
 * [...[2 3], [4 5], [12 7], ...].
 */
public class Problem30_TheSkylineProblem {

    /**
     * @param buildings - input array of building dimensions
     * @return skyline
     */
    public List<List<Integer>> getSkyline(int[][] buildings) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // Loop for all the buildings
        for (int[] building : buildings) {
            int left = building[0];
            int right = building[1];
            int height = building[2];
            Integer rightFloor = treeMap.floorKey(right);
            if (rightFloor == null || treeMap.get(rightFloor) < height) {
                treeMap.put(right, rightFloor == null ? 0 : treeMap.get(rightFloor));
            }
            Integer leftFloor = treeMap.floorKey(left);
            if (leftFloor == null || treeMap.get(leftFloor) < height) {
                treeMap.put(left, height);
            }
            List<Integer> delete = new ArrayList<>();
            for (Integer location : treeMap.subMap(left + 1, right).keySet()) {
                if (treeMap.get(location) < height) {
                    if (treeMap.lowerEntry(location) != null && treeMap.lowerEntry(location).getValue() > height) {
                        treeMap.put(location, height);
                    } else {
                        delete.add(location);
                    }
                }
            }
            treeMap.keySet().removeAll(delete);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Integer location : treeMap.keySet()) {
            int height = treeMap.get(location);
            if (!result.isEmpty() && result.get(result.size() - 1).get(1) == height) {
                continue;
            }
            result.add(Arrays.asList(location, height));
        }
        return result;
    }
}
