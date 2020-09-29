package com.github.pkg.utilities.strings;

public class Palindrome {

    /**
     * Checks whether the provided string is palindromic, that is it reads the same backwards.
     *
     * @param str - the string to check.
     * @return - a boolean, whether the word is palindromic or not
     */
    public static boolean isPalindromic(String str) {
        for (int index = 0; index <= str.length() / 2; index++) {
            if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }
}
