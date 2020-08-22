package org.redquark.leetcode.challenge;

import java.util.Random;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of non-overlapping axis-aligned rectangles rects, write a function pick which randomly
 * and uniformily picks an integer point in the space covered by the rectangles.
 * <p>
 * Note:
 * <p>
 * 1. An integer point is a point that has integer coordinates.
 * 2. A point on the perimeter of a rectangle is included in the space covered by the rectangles.
 * 3. ith rectangle = rects[i] = [x1,y1,x2,y2], where [x1, y1] are the integer coordinates of the
 * bottom-left corner, and [x2, y2] are the integer coordinates of the top-right corner.
 * 4. length and width of each rectangle does not exceed 2000.
 * 5. 1 <= rects.length <= 100
 * 6. pick return a point as an array of integer coordinates [p_x, p_y]
 * 7. pick is called at most 10000 times.
 * <p>
 * Explanation of Input Syntax:
 * <p>
 * The input is two lists: the subroutines called and their arguments. Solution's constructor has
 * one argument, the array of rectangles rects. pick has no arguments.
 * Arguments are always wrapped with a list, even if there aren't any.
 */
public class Problem22_RandomPointInNonOverlappingRectangles {
    int[] areas;
    int[][] rects;
    Random random;

    public Problem22_RandomPointInNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;
        this.areas = new int[rects.length];
        for (int i = 0; i < rects.length; i++) {
            areas[i] = getArea(rects[i]) + (i > 0 ? areas[i - 1] : 0); //Forgot to add
        }
        random = new Random();
    }

    public int[] pick() {
        int num = random.nextInt(areas[areas.length - 1]);
        int index = binarySearch(areas, num);
        if (index != 0) {
            num -= areas[index - 1];
        }
        return findKth(rects[index], num);
    }

    private int[] findKth(int[] rect, int num) {
        int pointEachRow = rect[2] - rect[0] + 1;
        int ansX = rect[0] + (num % pointEachRow);
        int ansY = rect[1] + (num / pointEachRow);
        return new int[]{ansX, ansY};
    }

    private int binarySearch(int[] areas, int num) {
        //find the smallest larger >;
        int l = 0, r = areas.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (areas[mid] <= num) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private int getArea(int[] rect) {
        return (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
    }
}
