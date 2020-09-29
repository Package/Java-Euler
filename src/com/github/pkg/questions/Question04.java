package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.strings.Palindrome;

public class Question04 extends Solution<Integer> {
    @Override
    public Integer solve() {
        int largest = 0;

        for (int x = 999; x > 0; x--) {
            for (int y = 999; y > 0; y--) {
                String current = String.valueOf(x * y);
                if (Palindrome.isPalindromic(current) && (x * y) > largest) {
                    largest = x * y;
                }
            }
        }

        return largest;
    }

    @Override
    public void test() {
        // Testing output of palindromic checker

        System.out.println(Palindrome.isPalindromic("bob")); // true
        System.out.println(Palindrome.isPalindromic("hadnndah")); // true
        System.out.println(Palindrome.isPalindromic("hello")); // false
    }
}
