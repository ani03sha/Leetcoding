package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In a town, there are N people labelled from 1 to N. There is a rumor that one of these people is secretly
 * the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts
 * the person labelled b.
 * <p>
 * If the town judge exists and can be identified, return the label of the town judge. Otherwise, return -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= N <= 1000
 * 0 <= trust.length <= 10^4
 * trust[i].length == 2
 * trust[i] are all different
 * trust[i][0] != trust[i][1]
 * 1 <= trust[i][0], trust[i][1] <= N
 */
public class Problem10_FindTheTownJudge {

    /**
     * @param N     - number of persons in a town
     * @param trust - 2D array in which first element trusts the another
     * @return - label of the judge if exists, else -1
     */
    public int findJudge(int N, int[][] trust) {
        // Count array - this will store the count of people trusting a person
        int[] count = new int[N + 1]; // Because the index is from 1 to N
        // Loop for each pair in the trust array
        for (int[] t : trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        // Loop to check which person has everyone's trust - (N-1)
        for (int i = 1; i <= N; i++) {
            if (count[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
