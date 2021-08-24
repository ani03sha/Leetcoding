package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A complex number can be represented as a string on the form "real+imaginaryi" where:
 * <p>
 * real is the real part and is an integer in the range [-100, 100].
 * imaginary is the imaginary part and is an integer in the range [-100, 100].
 * i2 == -1.
 * Given two complex numbers num1 and num2 as strings, return a string of the complex number
 * that represents their multiplications.
 * <p>
 * Constraints:
 * <p>
 * num1 and num2 are valid complex numbers.
 */
public class Problem24_ComplexNumberMultiplication {

    public String complexNumberMultiply(String num1, String num2) {
        // Special case
        if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty()) {
            return "";
        }
        // Split the real and imaginary parts
        String[] num1Array = num1.split("\\+");
        String[] num2Array = num2.split("\\+");
        int a = Integer.parseInt(num1Array[0]);
        int b = Integer.parseInt(num1Array[1].substring(0, num1Array[1].length() - 1));
        int c = Integer.parseInt(num2Array[0]);
        int d = Integer.parseInt(num2Array[1].substring(0, num2Array[1].length() - 1));
        // Calculate real and imaginary parts of product
        int real = a * c - b * d;
        int imaginary = b * c + a * d;
        return real + "+" + imaginary + "i";
    }
}
