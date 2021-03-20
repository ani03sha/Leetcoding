package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement the UndergroundSystem class:
 * <p>
 * void checkIn(int id, string stationName, int t)
 * A customer with a card id equal to id, gets in the station stationName at time t.
 * A customer can only be checked into one place at a time.
 * void checkOut(int id, string stationName, int t)
 * A customer with a card id equal to id, gets out from the station stationName at time t.
 * double getAverageTime(string startStation, string endStation)
 * Returns the average time to travel between the startStation and the endStation.
 * The average time is computed from all the previous traveling from startStation to endStation that happened directly.
 * Call to getAverageTime is always valid.
 * You can assume all calls to checkIn and checkOut methods are consistent.
 * If a customer gets in at time t1 at some station, they get out at time t2 with t2 > t1.
 * All events happen in chronological order.
 * <p>
 * Constraints:
 * <p>
 * There will be at most 20000 operations.
 * 1 <= id, t <= 10^6
 * All strings consist of uppercase and lowercase English letters, and digits.
 * 1 <= stationName.length <= 10
 * Answers within 10^-5 of the actual value will be accepted as correct.
 */
public class Problem20_DesignUndergroundSystem {

    static class UndergroundSystem {

        private final Map<Integer, String> checkInMap;
        private final Map<String, Integer> timeMap;
        private final Map<String, Integer> countMap;

        public UndergroundSystem() {
            checkInMap = new HashMap<>();
            timeMap = new HashMap<>();
            countMap = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            // Store the checkIn details
            checkInMap.put(id, stationName + "|" + t);
        }

        public void checkOut(int id, String stationName, int t) {
            // Get the check in object for the current id
            String[] passengerDetails = checkInMap.get(id).split("\\|");
            String previousStation = passengerDetails[0];
            int previousBoardingTime = Integer.parseInt(passengerDetails[1]);
            // Save the data in the time map
            String key = previousStation + "|" + stationName;
            timeMap.put(key, timeMap.getOrDefault(key, 0) + t - previousBoardingTime);
            // Update the count for the current combination
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        public double getAverageTime(String startStation, String endStation) {
            // Key for the current combination of stations
            String key = startStation + "|" + endStation;
            return ((double) timeMap.get(key)) / countMap.get(key);
        }
    }
}
