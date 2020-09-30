package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.primes.Primes;

public class Question10 extends Solution<Long> {
    @Override
    public Long solve() {
        var primes = Primes.generateUntil(2_000_000);
        return primes.stream().reduce(0L, Long::sum);
    }

    @Override
    public void test() {
        // Sum of primes below 10 is 17.
        var examplePrimes = Primes.generateUntil(10);
        System.out.println(examplePrimes.stream().reduce(0L, Long::sum) == 17);
    }
}
