package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of citations sorted in ascending order (each citation is a non-negative integer) of a
 * researcher, write a function to compute the researcher's h-index.
 * <p>
 * According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers
 * have at least h citations each, and the other N − h papers have no more than h citations each."
 * <p>
 * Note:
 * <p>
 * If there are several possible values for h, the maximum one is taken as the h-index.
 * <p>
 * Follow up:
 * <p>
 * This is a follow up problem to H-Index, where citations is now guaranteed to be sorted in ascending order.
 * Could you solve it in logarithmic time complexity?
 */
public class Problem18_HIndexII {

    /**
     * @param citations - array with citations
     * @return h-index of the author
     */
    public int hIndex(int[] citations) {
        // Length of the array
        int n = citations.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop until condition holds true
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            if (citations[middle] < n - middle) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return n - left;
    }
}
