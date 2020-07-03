package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.
 * <p>
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 * <p>
 * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 * Otherwise, it becomes vacant.
 * (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
 * <p>
 * We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied,
 * else cells[i] == 0.
 * <p>
 * Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)
 * <p>
 * cells.length == 8
 * cells[i] is in {0, 1}
 * 1 <= N <= 10^9
 */
public class Problem03_PrisonCellAfterNDays {

    /**
     * @param cells - state of prison cells in the beginning
     * @param N     - number of days
     * @return state of prison cells after N days
     */
    public int[] prisonAfterNDays(int[] cells, int N) {
        // Map to store states of the cell
        Map<String, Integer> states = new HashMap<>();
        // Loop until N is greater than zero
        while (N > 0) {
            // Temp array to store current state
            int[] currentState = new int[8];
            // Put the current state into the array
            states.put(Arrays.toString(cells), N--);
            // Loop for remaining the elements in the array
            for (int i = 1; i < 7; i++) {
                currentState[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }
            // Reassign current state back to the original array
            cells = currentState;
            // Check if the state is already present
            if (states.containsKey(Arrays.toString(cells))) {
                // Update N
                N %= states.get(Arrays.toString(cells)) - N;
            }
        }
        return cells;
    }
}
