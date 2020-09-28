package com.github.pkg.utilities.fib;

import java.util.*;

public class Fibonacci {

    public static List<Integer> sequence(final int numberOfElements) {
        final List<Integer> fibSequence = new ArrayList<Integer>();
        fibSequence.add(1);
        fibSequence.add(2);

        int currentElement = fibSequence.size();

        while (currentElement < numberOfElements) {
            final int lastItem = fibSequence.get(fibSequence.size() - 1);
            final int secondLastItem = fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(lastItem + secondLastItem);

            currentElement++;
        }
        return fibSequence;
    }

    public static List<Integer> until(final int maxElementSize) {
        final List<Integer> fibSequence = new ArrayList<Integer>();
        fibSequence.add(1);
        fibSequence.add(2);
        while (true) {
            final int lastItem = fibSequence.get(fibSequence.size() - 1);
            final int secondLastItem = fibSequence.get(fibSequence.size() - 2);
            final int nextItem = lastItem + secondLastItem;
            if (nextItem >= maxElementSize) {
                break;
            }
            fibSequence.add(nextItem);
        }
        return fibSequence;
    }
}
