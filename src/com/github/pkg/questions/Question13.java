package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.files.FileReader;
import java.math.BigInteger;

public class Question13 extends Solution<String> {
    @Override
    public String solve() {
        BigInteger total = BigInteger.ZERO;

        var lines = FileReader.readAsStringList("resources/Input13.txt");
        if (lines == null) {
            return null;
        }

        for (var line : lines) {
            total = total.add(new BigInteger(line));
        }

        // Question wants the first 10 digits
        return total.toString().substring(0, 10);
    }

    @Override
    public void test() {
        var content = FileReader.readAsStringList("resources/Input13.txt");
        if (content != null) {
            System.out.println(content.size() == 100);
        }
    }
}
