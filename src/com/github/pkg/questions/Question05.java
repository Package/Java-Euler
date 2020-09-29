package com.github.pkg.questions;

import com.github.pkg.solution.Solution;

public class Question05 extends Solution<Long> {

    private static final int MAX_RANGE = 20;

    @Override
    public Long solve() {
        long target = 10;

        while (true) {
            int divisor;

            /*
             * Check that the current number can be evenly divided by the range 1 to <code>MAX_RANGE</code>
             */
            for (divisor = 1; divisor < MAX_RANGE; divisor++) {
                if (target % divisor != 0) {
                    target++;
                    break;
                }
            }

            // If the number is divisible by the the whole range then this is the solution:
            if (divisor == MAX_RANGE) {
                return target;
            }
        }
    }

    @Override
    public void test() {

    }
}
