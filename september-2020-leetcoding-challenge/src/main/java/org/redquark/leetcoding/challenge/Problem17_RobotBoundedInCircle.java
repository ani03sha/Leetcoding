package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * On an infinite plane, a robot initially stands at (0, 0) and faces north.
 * The robot can receive one of three instructions:
 * <p>
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degress to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * <p>
 * Return true if and only if there exists a circle in the plane such that the robot never leaves
 * the circle.
 * <p>
 * Note:
 * <p>
 * 1 <= instructions.length <= 100
 * instructions[i] is in {'G', 'L', 'R'}
 */
public class Problem17_RobotBoundedInCircle {

    /**
     * @param instructions -string of instructions
     * @return true, if robot is bounded, false otherwise
     */
    public boolean isRobotBounded(String instructions) {
        // Initial coordinates
        int x = 0;
        int y = 0;
        // Initial direction
        char direction = 'N';
        // Loop through the set of instructions
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                if (direction == 'N') {
                    y++;
                } else if (direction == 'S') {
                    y--;
                } else if (direction == 'W') {
                    x--;
                } else {
                    x++;
                }
            } else if (c == 'L') {
                if (direction == 'N') {
                    direction = 'W';
                } else if (direction == 'S') {
                    direction = 'E';
                } else if (direction == 'W') {
                    direction = 'S';
                } else {
                    direction = 'N';
                }
            } else {
                if (direction == 'N') {
                    direction = 'E';
                } else if (direction == 'S') {
                    direction = 'W';
                } else if (direction == 'W') {
                    direction = 'N';
                } else {
                    direction = 'S';
                }
            }
        }
        return (x == 0 && y == 0) || direction != 'N';
    }
}
