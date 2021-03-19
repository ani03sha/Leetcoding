package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem19_KeysAndRoomsTest {

    private final Problem19_KeysAndRooms testObject = new Problem19_KeysAndRooms();

    @Test
    void testCanVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(3));
        rooms.add(Collections.emptyList());
        assertTrue(testObject.canVisitAllRooms(rooms));

        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(0));
        assertFalse(testObject.canVisitAllRooms(rooms));
    }
}