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
}
