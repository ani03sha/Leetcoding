package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There are several cards arranged in a row, and each card has an associated number of points.
 * The points are given in the integer array cardPoints.
 * <p>
 * In one step, you can take one card from the beginning or from the end of the row.
 * You have to take exactly k cards.
 * <p>
 * Your score is the sum of the points of the cards you have taken.
 * <p>
 * Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
 * <p>
 * Constraints:
 * <p>
 * 1 <= cardPoints.length <= 10^5
 * 1 <= cardPoints[i] <= 10^4
 * 1 <= k <= cardPoints.length
 */
public class Problem11_MaximumPointsYouCanObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        // Length of the array
        int n = cardPoints.length;
        // Total sum of all the elements in the array
        int totalSum = 0;
        // Sum of current window
        int currentWindowSum = 0;
        // Start and end pointers of the window of size n - k
        int start = 0;
        int end = 0;
        // Maximum points achieved by obtaining k cards
        int minPoints = Integer.MAX_VALUE;
        while (end < n) {
            totalSum += cardPoints[end];
            currentWindowSum += cardPoints[end];
            if (end - start + 1 > n - k) {
                currentWindowSum -= cardPoints[start];
                start++;
            }
            if (end - start + 1 == n - k) {
                minPoints = Math.min(minPoints, currentWindowSum);
            }
            end++;
        }
        return totalSum - minPoints;
    }
}
