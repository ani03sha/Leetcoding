package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a char array representing tasks CPU need to do. It contains capital letters A to Z where each
 * letter represents a different task.
 * <p>
 * Tasks could be done without the original order of the array. Each task is done in one unit of time.
 * For each unit of time, the CPU could complete either one task or just be idle.
 * <p>
 * However, there is a non-negative integer n that represents the cooldown period between two same
 * tasks (the same letter in the array), that is that there must be at least n units of time between
 * any two same tasks.
 * <p>
 * You need to return the least number of units of times that the CPU will take to finish all the
 * given tasks.
 */
public class Problem28_TaskScheduler {

    /**
     * @param tasks - array of tasks
     * @param n     - cool down interval
     * @return - minimum number of cycles needed to do all the tasks
     */
    public int leastInterval(char[] tasks, int n) {
        // This array stores the frequency of all the tasks
        int[] taskFrequency = new int[26];
        // Loop for all the tasks
        for (char c : tasks) {
            taskFrequency[c - 'A']++;
        }
        // Sort the array
        Arrays.sort(taskFrequency);
        // Maximum value of the character
        int maxValue = taskFrequency[25] - 1;
        // Idle slots
        int idleSlots = maxValue * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(taskFrequency[i], maxValue);
        }
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
