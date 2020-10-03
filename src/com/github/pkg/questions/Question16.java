package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.numbers.Numbers;

import java.math.BigInteger;

public class Question16 extends Solution<Integer> {
    @Override
    public Integer solve() {
        var bigPower = BigInteger.TWO.pow(1000);
        var digitSum = Numbers.sumDigitsInString(bigPower.toString());
        return digitSum;
    }

    @Override
    public void test() {
        System.out.println(solve() == 1366);
    }
}
