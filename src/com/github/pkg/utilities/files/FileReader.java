package com.github.pkg.utilities.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    /**
     * Reads the content from the provided <code>filePath</code> and returns it as a <code>String</code>.
     *
     * @param filePath - the path and file name of the file to read.
     * @return - a string containing the file's contents
     */
    public static String readAsString(String filePath) {
        StringBuilder builder = new StringBuilder();

        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            lines.forEach(builder::append);
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }

        return builder.toString();
    }

    public static int[][] readAsDimensionalArray(String filePath) {
        try {
            var content = Files.readAllLines(Paths.get(filePath));
            var data = new int[content.size()][content.size()];

            for (int row = 0; row < content.size(); row++) {
                var rowContent = content.get(row).split(" ");

                for (int col = 0; col < rowContent.length; col++) {
                    data[row][col] = Integer.parseInt(rowContent[col]);
                }
            }

            return data;
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }

        return null;
    }
}
