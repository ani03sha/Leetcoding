package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integers n and k, you need to construct a list which contains n different positive
 * integers ranging from 1 to n and obeys the following requirement:
 * <p>
 * Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... ,
 * |an-1 - an|] has exactly k distinct integers.
 * <p>
 * If there are multiple answers, print any of them.
 * <p>
 * Note:
 * The n and k are in the range 1 <= k < n <= 104.
 */
public class Problem12_BeautifulArrangementII {

    public int[] constructArray(int n, int k) {
        // Resultant array
        int[] result = new int[n];
        for (int i = 0, a = 1, z = k + 1; i <= k; i++) {
            result[i] = i % 2 == 1 ? z-- : a++;
        }
        for (int i = k + 1; i < n; ) {
            result[i] = ++i;
        }
        return result;
    }
}
