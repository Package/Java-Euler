package com.github.pkg.questions;

import com.github.pkg.solution.Solution;

public class Question09 extends Solution<Integer> {
    @Override
    public Integer solve() {
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                for (int c = 1; c < 1000; c++) {
                    if (isTriplet(a, b, c) && (a + b + c) == 1000) {
                        return a * b * c;
                    }
                }
            }
        }

        return null;
    }

    @Override
    public void test() {
        System.out.println(isTriplet(3, 4, 5));
    }

    private boolean isTriplet(int a, int b, int c) {
        if (a > b || a > c || b > c) {
            return false;
        }

        return (a * a) + (b * b) == (c * c);
    }
}
