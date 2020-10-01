package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.numbers.Numbers;

public class Question12 extends Solution<Integer> {
    @Override
    public Integer solve() {

        // Keep generating triangular numbers until one as over 500 factors
        int triangleNumber = 1;
        int index = 1;

        while (true) {
            index++;
            triangleNumber += index;

            var factors = Numbers.getFactors(triangleNumber);
            if (factors.size() >= 500) {
                break;
            }
        }

        return triangleNumber;
    }

    @Override
    public void test() {
        System.out.println(Numbers.getFactors(28));
    }
}
