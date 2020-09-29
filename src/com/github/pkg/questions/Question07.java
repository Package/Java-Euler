package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.primes.Primes;

import java.util.List;

public class Question07 extends Solution<Integer> {
    @Override
    public Integer solve() {
        List<Long> primes = Primes.generateAsList(10001);
        return (primes.get(primes.size() - 1)).intValue();
    }

    @Override
    public void test() {
        // 6th prime number should be "13"
        List<Long> primes = Primes.generateAsList(6);
        System.out.println(primes.get(primes.size() - 1) == 13);
    }
}
