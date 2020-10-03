package com.github.pkg.utilities.numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    /**
     * Returns all factors of a provided number.
     *
     * @param number - the number to generate factors for.
     * @return - a list of all factors of the number.
     */
    public static List<Integer> getFactors(int number) {
        var factors = new ArrayList<Integer>();

        // All numbers have factors of 1 and themselves (providing > 1)
        factors.add(1);
        if (number > 1) {
            factors.add(number);
        }

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                factors.add(divisor);
            }
        }

        return factors;
    }

    /**
     * Takes a string and adds each character together returning the total. Note that this
     * relies on the string only having valid numerical digits.
     *
     * e.g: <code>multiplyDigits("9989")</code>
     * 9 × 9 × 8 × 9 = 5832
     *
     * @param str - the string of digits to multiply
     * @return - the total once all digits are multiplied
     */
    public static int sumDigitsInString(String str) {
        return str.chars().reduce(0, (x, y) -> x + Math.abs('0' - y));
    }

    /**
     * Takes a string and multiples each character together returning the total. Note that this
     * relies on the string only having valid numerical digits.
     *
     * e.g: <code>multiplyDigits("9989")</code>
     * 9 × 9 × 8 × 9 = 5832
     *
     * @param str - the string of digits to multiply
     * @return - the total once all digits are multiplied
     */
    public static long multiplyDigitsInString(String str) {
        return str.chars().asLongStream().reduce(1, (x, y) -> x * Math.abs('0' - y));
    }
}
