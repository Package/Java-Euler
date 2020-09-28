package com.github.pkg.utilities.strings;

public class Palindrome {

    public static boolean isPalindromic(String str) {
        for (int index = 0; index <= str.length() / 2; index++) {
            if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }
}
