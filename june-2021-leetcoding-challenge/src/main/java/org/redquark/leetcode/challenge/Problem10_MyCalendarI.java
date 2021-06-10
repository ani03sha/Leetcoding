package org.redquark.leetcode.challenge;

import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement a MyCalendar class to store your events. A new event can be added if adding the event will
 * not cause a double booking.
 * <p>
 * Your class will have the method, book(int start, int end). Formally, this represents a booking on the
 * half open interval [start, end), the range of real numbers x such that start <= x < end.
 * <p>
 * A double booking happens when two events have some non-empty intersection (ie., there is some time that
 * is common to both events.)
 * <p>
 * For each call to the method MyCalendar.book, return true if the event can be added to the calendar
 * successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
 * <p>
 * Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
 * <p>
 * Note:
 * <p>
 * The number of calls to MyCalendar.book per test case will be at most 1000.
 * In calls to MyCalendar.book(start, end), start and end are integers in the range [0, 10^9].
 */
public class Problem10_MyCalendarI {

    static class MyCalendar {

        TreeMap<Integer, Integer> events;

        public MyCalendar() {
            events = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer previous = events.floorKey(start);
            Integer next = events.ceilingKey(start);
            if ((previous == null || events.get(previous) <= start) &&
                    (next == null || end <= next)) {
                events.put(start, end);
                return true;
            }
            return false;
        }
    }
}
