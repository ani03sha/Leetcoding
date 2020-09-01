package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * <p>
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger
 * if more time has elapsed since midnight.
 * <p>
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 * <p>
 * Note:
 * <p>
 * A.length == 4
 * 0 <= A[i] <= 9
 */
public class Problem01_LargestTimeForGivenDigits {

    private String ans;

    /**
     * @param A - input array with numbers
     * @return String representing the largest time
     */
    public String largestTimeFromDigits(int[] A) {
        ans = "";
        check(A[0], A[1], A[2], A[3]);
        check(A[0], A[2], A[1], A[3]);
        check(A[0], A[3], A[1], A[2]);
        check(A[1], A[2], A[0], A[3]);
        check(A[1], A[3], A[0], A[2]);
        check(A[2], A[3], A[0], A[1]);

        return ans;
    }

    // For this choice of hour and minute digits, update the answer
    public void check(int h1, int h2, int m1, int m2) {
        String hour = best(h1, h2, 24);
        String minute = best(m1, m2, 60);
        if (hour.isEmpty() || minute.isEmpty()) return;

        String cand = hour + ":" + minute;
        if (cand.compareTo(ans) > 0) ans = cand;
    }

    // What is the largest string less than limit from these 2 digits?
    public String best(int d1, int d2, int limit) {
        int ans = Math.max(10 * d1 + d2 < limit ? 10 * d1 + d2 : -1,
                10 * d2 + d1 < limit ? 10 * d2 + d1 : -1);
        return ans >= 0 ? String.format("%02d", ans) : "";
    }
}
