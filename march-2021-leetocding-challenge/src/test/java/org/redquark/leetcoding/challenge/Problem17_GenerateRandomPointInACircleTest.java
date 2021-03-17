package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.redquark.leetcoding.challenge.Problem17_GenerateRandomPointInACircle.RandomPoint;


class Problem17_GenerateRandomPointInACircleTest {

    @Test
    void test() {
        int radius = 1;
        int x_center = 0;
        int y_center = 0;
        RandomPoint randomPoint = new RandomPoint(radius, x_center, y_center);
        System.out.println(Arrays.toString(randomPoint.randPoint()));
    }
}