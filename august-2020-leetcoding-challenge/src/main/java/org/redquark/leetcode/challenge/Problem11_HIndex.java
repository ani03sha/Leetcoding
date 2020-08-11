package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of citations (each citation is a non-negative integer) of a researcher,
 * write a function to compute the researcher's h-index.
 * <p>
 * According to the definition of <a href='https://en.wikipedia.org/wiki/H-index'></a>h-index on Wikipedia: "A scientist has index h if h of his/her N papers
 * have at least h citations each, and the other N − h papers have no more than h citations each."
 * <p>
 * Note: If there are several possible values for h, the maximum one is taken as the h-index.
 */
public class Problem11_HIndex {

    /**
     * @param citations - array containing citations for each paper
     * @return - H index of the author
     */
    public int hIndex(int[] citations) {
        // Base condition
        if (citations == null) {
            return 0;
        }
        // Length of the array
        int n = citations.length;
        // Frequency map
        int[] citationsFrequency = new int[n + 1];
        // Loop through the array to update the frequency array
        for (int citation : citations) {
            if (citation > n) {
                citationsFrequency[n]++;
            } else {
                citationsFrequency[citation]++;
            }
        }
        // This variable will store the h index
        int hIndex = 0;
        // Now run reverse loop
        for (int i = citationsFrequency.length - 1; i >= 0; i--) {
            hIndex += citationsFrequency[i];
            if (hIndex >= i) {
                return i;
            }
        }
        return 0;
    }
}
