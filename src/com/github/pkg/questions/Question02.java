package com.github.pkg.questions;

import com.github.pkg.solution.*;
import com.github.pkg.utilities.fib.*;
import java.util.*;

public class Question02 extends Solution<Integer> {

    @Override
    public Integer solve() {
        final List<Integer> list = Fibonacci.until(4000000);
        return list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}
