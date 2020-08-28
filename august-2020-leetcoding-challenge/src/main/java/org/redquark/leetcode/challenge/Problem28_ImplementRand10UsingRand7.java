package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a function rand7 which generates a uniform random integer in the range 1 to 7, write a function
 * rand10 which generates a uniform random integer in the range 1 to 10.
 * <p>
 * Do NOT use system's Math.random().
 * <p>
 * Note:
 * <p>
 * rand7 is predefined.
 * Each testcase has one argument: n, the number of times that rand10 is called.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What is the expected value for the number of calls to rand7() function?
 * Could you minimize the number of calls to rand7()?
 */
public class Problem28_ImplementRand10UsingRand7 {

    /**
     * @return a random number between 1 and 10
     */
    public int rand10() {
        int index;
        do {
            index = 7 * (rand7() - 1) + rand7();
        } while (index > 40);
        return index % 10 + 1;
    }

    private int rand7() {
        return (int) (Math.random() * (7));
    }
}
