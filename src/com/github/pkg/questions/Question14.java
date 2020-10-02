package com.github.pkg.questions;

import com.github.pkg.solution.Solution;

import java.util.HashMap;
import java.util.Map;

public class Question14 extends Solution<Integer> {
    private final Map<Long, Integer> collatzMap = new HashMap<>();

    @Override
    public Integer solve() {
        var bestChain = 0;
        var bestNumber = 0;

        for (var number = 1; number < 1_000_000; number++) {
            var chainSize = collatzSequenceFromNumber(number);

            if (chainSize > bestChain) {
                bestChain = chainSize;
                bestNumber = number;
            }
        }

        return bestNumber;
    }

    @Override
    public void test() {
        System.out.println(nextCollatzNumber(13) == 40); // Odd number
        System.out.println(nextCollatzNumber(40) == 20); // Even number
    }

    /**
     * Recursively calculates the length of the collatz sequence from a provided number.
     * Uses dynamic programming to memorize results already calculated which allows the solution to run instantly.
     *
     * @param number - the starting number
     * @return - the number of elements in the collatz sequence from the given starting number.
     */
    public int collatzSequenceFromNumber(long number) {
        // Edge case, found the end of the sequence when the number is reduced to 1.
        if (number == 1) {
            return 1;
        }

        // If seen this solution before, return the cached answer.
        if (collatzMap.containsKey(number)) {
            return collatzMap.get(number);
        }

        // Recursively continue generating the solution and cache once found.
        var next = 1 + collatzSequenceFromNumber(nextCollatzNumber(number));
        collatzMap.put(number, next);

        return next;
    }

    /**
     * Returns the next number from the current number in the Collatz sequence.
     * If the number provided is even, the next number is <code>number / 2</code>.
     * If the number provided is odd, the next number is <code>(3 * number) + 1</code>
     *
     * @param number - the current number
     * @return - the next number in the Collatz sequence
     */
    public long nextCollatzNumber(long number) {
        if (number % 2 == 0) {
            return number / 2;
        }

        return (number * 3) + 1;
    }
}
