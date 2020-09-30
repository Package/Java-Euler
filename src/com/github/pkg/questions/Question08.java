package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.files.FileReader;

public class Question08 extends Solution<Long> {

    @Override
    public Long solve() {
        String digits = FileReader.readAsString("resources/Input08.txt");
        int adjacentDigits = 13;
        long bestProduct = 0;

        for (int index = 0; index < digits.length() - adjacentDigits; index++) {
            String current = digits.substring(index, index + adjacentDigits);
            long currentProduct = multiplyDigits(current);

            if (currentProduct > bestProduct) {
                bestProduct = currentProduct;
            }
        }

        return bestProduct;
    }

    /**
     * Takes a string and multiples each character together returning the total. Note that this
     * relies on the string only having valid numerical digits.
     *
     * e.g: <code>multiplyDigits("9989")</code>
     * 9 × 9 × 8 × 9 = 5832
     *
     * @param digits - the string of digits to multiply
     * @return - the total once all digits are multiplied
     */
    private long multiplyDigits(String digits) {
        // A more Java8 and functional solution.
        return digits.chars().asLongStream().reduce(1, (x, y) -> x * Math.abs('0' - y));
    }

    private long multiplyDigitsOriginal(String digits) {
        // A more classic approach, iterating each character summing up

        long sum = 1;

        for (int c : digits.toCharArray()) {
            sum *= Math.abs('0' - c);
        }

        return sum;
    }

    @Override
    public void test() {
        String content = FileReader.readAsString("resources/Input08.txt");
        System.out.println("Has file content: " + (content.length() > 0));
        System.out.println("Java8 answer: " + (multiplyDigits("9989") == 5832));
        System.out.println("Original answer: " + (multiplyDigitsOriginal("9989") == 5832));
    }
}
