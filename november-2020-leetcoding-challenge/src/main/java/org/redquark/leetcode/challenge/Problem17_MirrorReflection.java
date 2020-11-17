package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There is a special square room with mirrors on each of the four walls.
 * Except for the southwest corner, there are receptors on each of the remaining corners,
 * numbered 0, 1, and 2.
 * <p>
 * The square room has walls of length p, and a laser ray from the southwest corner first meets
 * the east wall at a distance q from the 0th receptor.
 * <p>
 * Return the number of the receptor that the ray meets first.  (It is guaranteed that the ray
 * will meet a receptor eventually.)
 * <p>
 * Note:
 * <p>
 * 1 <= p <= 1000
 * 0 <= q <= p
 */
public class Problem17_MirrorReflection {

    public int mirrorReflection(int p, int q) {
        int gcd = gcd(p, q);
        p /= gcd;
        p %= 2;
        q /= gcd;
        q %= 2;
        if (p == 1 && q == 1) {
            return 1;
        }
        return p == 1 ? 0 : 2;
    }

    private int gcd(int p, int q) {
        if (p == 0) {
            return q;
        }
        return gcd(q % p, p);
    }
}
