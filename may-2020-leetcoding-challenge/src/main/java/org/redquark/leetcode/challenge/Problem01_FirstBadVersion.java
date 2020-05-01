package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following
 * ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class Problem01_FirstBadVersion {

    /**
     * @param n          - number of version
     * @param badVersion -first bad version
     * @return - the first bad version
     * <p>
     * Algorithm:
     * We will apply binary search to find the first bad version
     */
    public int firstBadVersion(int n, int badVersion) {
        // Left and right pointers
        int left = 1;
        int right = n;
        /*
         * Simple binary search below
         */
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle, badVersion)) {
                right = middle;
            } else {
                left = middle + 1;
            }
            if (left == right) {
                return left;
            }
        }
        return n;
    }

    /**
     * @param version    - version to be tested
     * @param badVersion - first bad version
     * @return - true, if a version is bad or not
     */
    private boolean isBadVersion(int version, int badVersion) {
        return version == badVersion || version > badVersion;
    }
}
