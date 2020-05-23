package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the
 * image (from 0 to 65535).
 * <p>
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill,
 * and a pixel value newColor, "flood fill" the image.
 * <p>
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to
 * the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally
 * to those pixels (also with the same color as the starting pixel), and so on.
 * <p>
 * Replace the color of all of the aforementioned pixels with the newColor.
 * <p>
 * At the end, return the modified image.
 */
public class Problem11_FloodFill {

    /**
     * @param image    - image array
     * @param sr       - starting row
     * @param sc       - starting column
     * @param newColor - new color to be filled
     * @return - new image
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Base condition - if the new color is already at the sr, sc
        if (image[sr][sc] == newColor) {
            return image;
        }
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void fill(int[][] image, int i, int j, int color, int newColor) {
        // Base condition
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != color) {
            return;
        }
        // Fill the new color at the ijth position
        image[i][j] = newColor;
        // Recursive calls to left, right, up and down
        fill(image, i + 1, j, color, newColor);
        fill(image, i - 1, j, color, newColor);
        fill(image, i, j + 1, color, newColor);
        fill(image, i, j - 1, color, newColor);
    }
}
