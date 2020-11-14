package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There are 1000 buckets, one and only one of them is poisonous, while the rest are filled with water.
 * They all look identical. If a pig drinks the poison it will die within 15 minutes.
 * What is the minimum amount of pigs you need to figure out which bucket is poisonous within one hour?
 * <p>
 * Answer this question, and write an algorithm for the general case.
 * <p>
 * General case:
 * <p>
 * If there are n buckets and a pig drinking poison will die within m minutes, how many pigs (x) you need to figure out the poisonous bucket within p minutes? There is exactly one bucket with poison.
 * <p>
 * Note:
 * <p>
 * A pig can be allowed to drink simultaneously on as many buckets as one would like, and the feeding
 * takes no time.
 * After a pig has instantly finished drinking buckets, there has to be a cool down time of m minutes.
 * During this time, only observation is allowed and no feedings at all.
 * Any given bucket can be sampled an infinite number of times (by an unlimited number of pigs).
 */
public class Problem14_PoorPigs {

    /**
     * @param buckets       - number of buckets
     * @param minutesToDie  - number of maximum minutes a pig can survive after diriking from bucket
     * @param minutesToTest - number of minutes to test
     * @return minimum number of pigs needed to determine the poisonous bucket
     */
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int count = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets) / Math.log(count));
    }
}
