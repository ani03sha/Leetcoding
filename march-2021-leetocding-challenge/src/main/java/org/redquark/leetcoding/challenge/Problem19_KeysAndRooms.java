package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1,
 * and each room may have some keys to access the next room.
 * <p>
 * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1]
 * where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
 * <p>
 * Initially, all the rooms start locked (except for room 0).
 * <p>
 * You can walk back and forth between rooms freely.
 * <p>
 * Return true if and only if you can enter every room.
 * <p>
 * Note:
 * <p>
 * 1 <= rooms.length <= 1000
 * 0 <= rooms[i].length <= 1000
 * The number of keys in all rooms combined is at most 3000.
 */
public class Problem19_KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Set that will keep track of the
        // rooms that we have visited
        Set<Integer> visited = new HashSet<>();
        // Make 0th room as visited
        visited.add(0);
        // This stack will keep track of the rooms
        // that we have visited
        Stack<Integer> room = new Stack<>();
        // Add 0th room to the stack
        room.add(0);
        // Loop until the stack is empty
        while (!room.isEmpty()) {
            // Get the keys in the current room
            List<Integer> keys = rooms.get(room.pop());
            // Loop for all the keys
            for (int key : keys) {
                if (!visited.contains(key)) {
                    visited.add(key);
                    room.add(key);
                }
            }
        }
        // Since the set contains the rooms which are
        // visited and if all the rooms are visited
        // then the size of set should be equal to the
        // the size of the rooms
        return visited.size() == rooms.size();
    }
}
