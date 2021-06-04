package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots:
 * '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'.
 * <p>
 * The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'.
 * Each move consists of turning one wheel one slot.
 * <p>
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 * <p>
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes,
 * the wheels of the lock will stop turning and you will be unable to open it.
 * <p>
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum
 * total number of turns required to open the lock, or -1 if it is impossible.
 * <p>
 * Constraints:
 * <p>
 * 1 <= deadends.length <= 500
 * deadends[i].length == 4
 * target.length == 4
 * target will not be in the list deadends.
 * target and deadends[i] consist of digits only.
 */
public class Problem04_OpenTheLock {

    public int openLock(String[] deadends, String target) {
        // Special cases
        if (deadends == null || deadends.length == 0 || target == null || target.isEmpty()) {
            return 0;
        }
        // Add all the deadends in a set for constant time lookup
        Set<String> deadEnds = new HashSet<>(Arrays.asList(deadends));
        // Set to store all the combinations of the lock which have been visited
        Set<String> visited = new HashSet<>();
        // Add the initial lock position
        visited.add("0000");
        // Queue to perform BFS for all the combinations
        Queue<String> lockPositions = new LinkedList<>();
        // Add first position in the queue
        lockPositions.offer("0000");
        // Total number of turns required to open the lock
        int turns = 0;
        // Loop through the queue until it is empty
        while (!lockPositions.isEmpty()) {
            // Get the size of the queue
            int size = lockPositions.size();
            // Loop for all the current elements in the queue
            while (size > 0) {
                // Get the current lock position
                String currentLockPosition = lockPositions.poll();
                // Check if we have hit one of the dead ends
                if (deadEnds.contains(currentLockPosition)) {
                    size--;
                    continue;
                }
                if (currentLockPosition != null) {
                    // If we have reached the desired targer position
                    if (currentLockPosition.equals(target)) {
                        return turns;
                    }
                    // Now we will check for various lock combinations
                    StringBuilder combination = new StringBuilder(currentLockPosition);
                    // Since every position have four characters, we will try for every combination
                    for (int i = 0; i < 4; i++) {
                        // Current character
                        char c = combination.charAt(i);
                        // Create two combinations
                        String s1 = combination.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + combination.substring(i + 1);
                        String s2 = combination.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + combination.substring(i + 1);
                        // If the above strings have not already been visited and are not deadends,
                        // we will add them to the queue of possible lock combinations
                        if (!deadEnds.contains(s1) && !visited.contains(s1)) {
                            lockPositions.offer(s1);
                            visited.add(s1);
                        }
                        if (!deadEnds.contains(s2) && !visited.contains(s2)) {
                            lockPositions.offer(s2);
                            visited.add(s2);
                        }
                    }
                }
                size--;
            }
            turns++;
        }
        return -1;
    }
}
