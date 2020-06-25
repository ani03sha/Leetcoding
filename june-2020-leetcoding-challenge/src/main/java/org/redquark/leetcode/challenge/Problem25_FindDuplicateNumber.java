package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least
 * one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class Problem25_FindDuplicateNumber {

    /**
     * @param numbers - input array of numbers
     * @return duplicate number
     */
    public int findDuplicate(int[] numbers) {
        /*
         * Here, we are assuming arrays as linked lists
         * */

        // Slow and fast pointers
        int slow = numbers[0];
        int fast = numbers[0];

        // Move the slow pointer one step ahead and fast pointer two steps ahead
        slow = numbers[slow];
        fast = numbers[numbers[fast]];

        // Loop until slow pointer is equal to the fast pointer
        while (slow != fast) {
            // Move the slow pointer one step ahead and fast pointer two steps ahead
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
        }
        // Bring slow pointer back to the first element of the array and keep fast pointer as is
        slow = numbers[0];
        // Again loop until we have slow pointer not equal to fast pointer
        while (slow != fast) {
            // Move both pointers one step ahead
            slow = numbers[slow];
            fast = numbers[fast];
        }
        return slow;
    }
}
