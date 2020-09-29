package com.github.pkg.questions;

import com.github.pkg.solution.Solution;

import java.util.stream.IntStream;

public class Question06 extends Solution<Long> {

    @Override
    public Long solve() {
        long sumOfSquares = sumOfSquares(100);
        long squareOfSum = squareOfSum(100);
        long difference = squareOfSum - sumOfSquares;

        return difference;
    }

    @Override
    public void test() {
        long sumOfSquares = sumOfSquares(10); // 385
        long squareOfSum = squareOfSum(10); // 3025
        long difference = squareOfSum - sumOfSquares; // 2640

        System.out.println(sumOfSquares == 385);
        System.out.println(squareOfSum == 3025);
        System.out.println(difference == 2640);
    }

    /**
     * Returns the total sum of every number squared between 1 and the <code>maxRange</code>.
     * @param maxRange - the maximum range to go up to.
     * @return - the sum of each number squared in the range.
     */
    private long sumOfSquares(int maxRange) {
        return IntStream.rangeClosed(1, maxRange).map(i -> i * i).sum();
    }

    /**
     * Returns the square of the sum of every number between 1 and the <code>maxRange</code>
     * @param maxRange - the maximum range to go up to.
     * @return - the square of the sum of the range.
     */
    private long squareOfSum(int maxRange) {
        return (long) Math.pow(IntStream.rangeClosed(1, maxRange).sum(), 2);
    }
}
