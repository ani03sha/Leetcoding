package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem21_AsteroidCollisionTest {

    private final Problem21_AsteroidCollision testObject = new Problem21_AsteroidCollision();

    @Test
    void testAsteroidCollision() {
        int[] asteroids = new int[]{5, 10, -5};
        int[] expected = new int[]{5, 10};
        assertArrayEquals(expected, testObject.asteroidCollision(asteroids));

        asteroids = new int[]{8, -8};
        expected = new int[]{};
        assertArrayEquals(expected, testObject.asteroidCollision(asteroids));

        asteroids = new int[]{10, 2, -5};
        expected = new int[]{10};
        assertArrayEquals(expected, testObject.asteroidCollision(asteroids));

        asteroids = new int[]{-2, -1, 1, 2};
        expected = new int[]{-2, -1, 1, 2};
        assertArrayEquals(expected, testObject.asteroidCollision(asteroids));
    }
}