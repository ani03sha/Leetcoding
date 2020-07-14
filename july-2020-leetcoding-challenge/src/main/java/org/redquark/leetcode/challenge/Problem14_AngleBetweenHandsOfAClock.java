package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two numbers, hour and minutes. Return the smaller angle (in degrees) formed between the
 * hour and the minute hand.
 * <p>
 * Constraints:
 * <p>
 * 1 <= hour <= 12
 * 0 <= minutes <= 59
 * Answers within 10^-5 of the actual value will be accepted as correct.
 */
public class Problem14_AngleBetweenHandsOfAClock {

    /**
     * @param hours   - position of hour hand
     * @param minutes - position of minutes
     * @return - angle between hour and minute
     */
    public double angleClock(int hours, int minutes) {
        // Angle traversed by the minutes' hand
        double minuteAngle = minutes * 6;
        // Angle traverse by the hours' hand
        double hourAngle = ((hours * 60 + minutes) / 2.0) % 360;
        // Final angle
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}
