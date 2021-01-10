package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array instructions, you are asked to create a sorted array from the
 * elements in instructions.
 * You start with an empty container nums. For each element from left to right in instructions,
 * insert it into nums.
 * <p>
 * The cost of each insertion is the minimum of the following:
 * - The number of elements currently in nums that are strictly less than instructions[i].
 * - The number of elements currently in nums that are strictly greater than instructions[i].
 * <p>
 * For example, if inserting element 3 into nums = [1,2,3,5],
 * the cost of insertion is min(2, 1) (elements 1 and 2 are less than 3,
 * element 5 is greater than 3) and nums will become [1,2,3,3,5].
 * <p>
 * Return the total cost to insert all elements from instructions into nums.
 * Since the answer may be large, return it modulo 10^ 9 + 7
 * <p>
 * Constraints:
 * <p>
 * 1 <= instructions.length <= 105
 * 1 <= instructions[i] <= 105
 */
public class Problem10_CreateSortedArrayThroughInstructions {

    private int[] nums;

    /**
     * @param instructions - array with instructions
     * @return - total cost
     */
    public int createSortedArray(int[] instructions) {
        // Cost to insert
        int cost = 0;
        // Length of the array
        int n = instructions.length;
        // Initialize the nums array
        nums = new int[100001];
        // Modulo
        int modulo = (int) (1e9 + 7);
        // Loop for every element in the instructions
        for (int i = 0; i < n; i++) {
            cost = (cost + Math.min(get(instructions[i] - 1), i - get(instructions[i]))) % modulo;
            update(instructions[i]);
        }
        return cost;
    }

    private void update(int instruction) {
        while (instruction < 100001) {
            nums[instruction]++;
            instruction += instruction & -instruction;
        }
    }

    private int get(int instruction) {
        int count = 0;
        while (instruction > 0) {
            count += nums[instruction];
            instruction -= instruction & -instruction;
        }
        return count;
    }
}
