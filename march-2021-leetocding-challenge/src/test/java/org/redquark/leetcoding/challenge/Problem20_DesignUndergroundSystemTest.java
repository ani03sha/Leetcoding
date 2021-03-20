package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem20_DesignUndergroundSystem.UndergroundSystem;

class Problem20_DesignUndergroundSystemTest {

    @Test
    void test() {
        UndergroundSystem testObject = new UndergroundSystem();
        testObject.checkIn(45, "Leyton", 3);
        testObject.checkIn(32, "Paradise", 8);
        testObject.checkIn(27, "Leyton", 10);
        testObject.checkOut(45, "Waterloo", 15);
        testObject.checkOut(27, "Waterloo", 20);
        testObject.checkOut(32, "Cambridge", 22);
        assertEquals(14.0, testObject.getAverageTime("Paradise", "Cambridge"));
        assertEquals(11.0, testObject.getAverageTime("Leyton", "Waterloo"));
        testObject.checkIn(10, "Leyton", 24);
        assertEquals(11.0, testObject.getAverageTime("Leyton", "Waterloo"));
        testObject.checkOut(10, "Waterloo", 38);
        assertEquals(12.0, testObject.getAverageTime("Leyton", "Waterloo"));

        testObject = new UndergroundSystem();
        testObject.checkIn(10, "Leyton", 3);
        testObject.checkOut(10, "Paradise", 8);
        assertEquals(5.0, testObject.getAverageTime("Leyton", "Paradise"));
        testObject.checkIn(5, "Leyton", 10);
        testObject.checkOut(5, "Paradise", 16);
        assertEquals(5.5, testObject.getAverageTime("Leyton", "Paradise"));
        testObject.checkIn(2, "Leyton", 21);
        testObject.checkOut(2, "Paradise", 30);
        assertEquals(6.666666666666667, testObject.getAverageTime("Leyton", "Paradise"));
    }

}