package com.github.pkg.questions;

import com.github.pkg.solution.*;
import java.util.stream.*;

public class Question01 extends Solution<Integer>
{
    @Override
    public Integer solve() {
        int sum = 0;
        for (int x = 0; x < 1000; ++x) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }

        final int streamSum = IntStream.range(0, 1000).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
        return streamSum;
    }
}
