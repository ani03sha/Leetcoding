package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * There are n different online courses numbered from 1 to n.
 * You are given an array courses where courses[i] = [durationi, lastDayi] indicate that
 * the ith course should be taken continuously for durationi days and must be finished before or on lastDayi.
 * <p>
 * You will start on the 1st day and you cannot take two or more courses simultaneously.
 * <p>
 * Return the maximum number of courses that you can take.
 * <p>
 * Constraints:
 * <p>
 * 1 <= courses.length <= 10^4
 * 1 <= durationi, lastDayi <= 10^4
 */
public class Problem02_CourseScheduleIII {

    public int scheduleCourse(int[][] courses) {
        // Sort the courses based on the duration
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        // Max heap to store courses that we have selected so far
        Queue<Integer> selectedCourses = new PriorityQueue<>((a, b) -> b - a);
        // Time elapsed so far
        int elapsedTime = 0;
        // Iterate through every course
        for (int[] course : courses) {
            // Check if the total time elapsed after including the
            // current course duration
            if (elapsedTime + course[0] <= course[1]) {
                // Add this course to the heap
                selectedCourses.offer(course[0]);
                // Update the elapsed time
                elapsedTime += course[0];
            }
            // Check if the heap is non-empty and the root of
            // the heap has a course with duration greater
            // than the current course duration
            else if (!selectedCourses.isEmpty() && selectedCourses.peek() > course[0]) {
                // Remove the root of the heap as we have a better
                // option available
                elapsedTime -= selectedCourses.poll();
                // Add current course to the heap
                selectedCourses.offer(course[0]);
                // Update the time
                elapsedTime += course[0];
            }
        }
        return selectedCourses.size();
    }
}
