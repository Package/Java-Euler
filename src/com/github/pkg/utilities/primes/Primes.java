package com.github.pkg.utilities.primes;

import java.util.ArrayList;
import java.util.List;

public class Primes {

    /**
     * Determines whether a number is a Prime Number, that is - only divisible by 1 and itself.
     *
     * @param number - the number to check
     * @return - a boolean whether the number is prime.
     */
    public static boolean isPrime(long number) {
        // Edge case - two being the only even prime
        if (number == 2)  {
            return true;
        }

        // Any other even number is not prime
        if (number % 2 == 0 || number < 2) {
            return false;
        }

        // Check all other odd numbers upto the square root,
        // if the number is divisible by any then it cannot be prime.
        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Long> generateAsList(int numberOfElements) {
        List<Long> primes = new ArrayList<>();
        primes.add(2L); // Edge case - only even prime

        for (long number = 3; ; number += 2) {
            if (primes.size() == numberOfElements) {
                break;
            }

            if (isPrime(number)) {
                primes.add(number);
            }
        }

        return primes;
    }
}
