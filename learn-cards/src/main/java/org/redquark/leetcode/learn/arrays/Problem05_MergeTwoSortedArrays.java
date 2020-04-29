package org.redquark.leetcode.learn.arrays;

public class Problem05_MergeTwoSortedArrays {

    public int[] merge(int[] numbers1, int m, int[] numbers2, int n) {
        int count = numbers1.length - 1; // or count = m + n - 1
        // Decrement m and n to reach end of the elements in the arrays
        --m;
        --n;
        // Loop for both the arrays
        while (m >= 0 && n >= 0) {
            // Check for the bigger element between the elements in the array
            if (numbers1[m] > numbers2[n]) {
                numbers1[count] = numbers1[m];
                count--;
                m--;
            } else {
                numbers1[count] = numbers2[n];
                count--;
                n--;
            }
        }
        // If some elements are remaining in the second array
        while (n >= 0) {
            numbers1[count] = numbers2[n];
            count--;
            n--;
        }
        return numbers1;
    }
}
