package org.redquark.leetcoding.challenge;

import java.util.Random;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the radius and x-y positions of the center of a circle, write a function randPoint
 * which generates a uniform random point in the circle.
 * <p>
 * Note:
 * <p>
 * 1. input and output values are in floating-point.
 * 2. radius and x-y position of the center of the circle is passed into the class constructor.
 * 3. a point on the circumference of the circle is considered to be in the circle.
 * 4. randPoint returns a size 2 array containing x-position and y-position of the random point,
 * in that order.
 */
public class Problem17_GenerateRandomPointInACircle {

    static class RandomPoint {

        private final double radius;
        private final double x_center;
        private final double y_center;

        public RandomPoint(double radius, double x_center, double y_center) {
            this.radius = radius;
            this.x_center = x_center;
            this.y_center = y_center;
        }

        public double[] randPoint() {
            double length = Math.sqrt(Math.random()) * radius;
            double degree = Math.random() * 2 * Math.PI;
            double x = x_center + length * Math.cos(degree);
            double y = y_center + length * Math.sin(degree);
            return new double[]{x, y};
        }
    }

    static class RandomPoint2 {

        private final double radius;
        private final double x_center;
        private final double y_center;
        private final Random random;

        RandomPoint2(double radius, double x_center, double y_center) {
            this.radius = radius;
            this.x_center = x_center;
            this.y_center = y_center;
            this.random = new Random();
        }

        public double[] randPoint() {
            double x = randomCoordinate(x_center, radius);
            double y = randomCoordinate(y_center, radius);
            while ((x - x_center) * (x - x_center) + (y - y_center) * (y - y_center) >= radius * radius) {
                x = randomCoordinate(x_center, radius);
                y = randomCoordinate(y_center, radius);
            }
            return new double[]{x, y};
        }

        private double randomCoordinate(double p, double r) {
            return p - r + random.nextDouble() * 2 * r;
        }
    }
}
