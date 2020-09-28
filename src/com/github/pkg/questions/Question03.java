package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.primes.Primes;

public class Question03 extends Solution<Integer> {

    @Override
    public Integer solve() {
        int biggestDivisor = 0;
        final long target = 600851475143L;

        for (int divisor = 3; divisor <= Math.sqrt(target); divisor += 2) {
            if (target % divisor == 0 && Primes.isPrime(divisor) && divisor > biggestDivisor) {
                biggestDivisor = divisor;
            }
        }

        return biggestDivisor;
    }
}
