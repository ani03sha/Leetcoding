package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 * <p>
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * <p>
 * The . character does not represent a decimal point and is used to separate number sequences.
 * <p>
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 * <p>
 * You may assume the default revision number for each level of a version number to be 0. For example,
 * version number 3.4 has a revision number of 3 and 4 for its first and second level revision number.
 * Its third and fourth level revision number are both 0.
 * <p>
 * Note:
 * <p>
 * Version strings are composed of numeric strings separated by dots . and this numeric strings may
 * have leading zeroes.
 * Version strings do not start or end with dots, and they will not be two consecutive dots.
 */
public class Problem09_CompareVersionNumbers {

    /**
     * @param version1 - string representing version 1
     * @param version2 - string representing version 2
     * @return - comparison result
     */
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int n = Math.max(n1, n2);
        int c1;
        int c2;
        for (int i = 0; i < n; i++) {
            if (n1 > 0) {
                c1 = Integer.parseInt(v1[i]);
                n1--;
            } else {
                c1 = 0;
            }
            if (n2 > 0) {
                c2 = Integer.parseInt(v2[i]);
                n2--;
            } else {
                c2 = 0;
            }
            if (c1 > c2) {
                return 1;
            }
            if (c1 < c2) {
                return -1;
            }
        }
        return 0;
    }
}
