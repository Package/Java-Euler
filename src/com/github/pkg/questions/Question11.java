package com.github.pkg.questions;

import com.github.pkg.solution.Solution;
import com.github.pkg.utilities.files.FileReader;

import java.util.*;

public class Question11 extends Solution<Integer> {

    private static final int[][] PRODUCT_GRID;

    static {
        PRODUCT_GRID = FileReader.readAsDimensionalArray("resources/Input11.txt");
    }

    @Override
    public Integer solve() {
        var largestProduct = 0;
        for (int x = 0; x < PRODUCT_GRID.length; x++) {
            for (int y = 0; y < PRODUCT_GRID.length; y++) {
                var currentProduct = largestProductFromLocation(x, y);
                if (currentProduct > largestProduct) {
                    largestProduct = currentProduct;
                }
            }
        }

        return largestProduct;
    }

    @Override
    public void test() {
        System.out.println(PRODUCT_GRID != null);
        System.out.println(PRODUCT_GRID.length == 20);
    }

    /**
     * From a given (x, y) location in the grid, returns the largest product that can be made from multiplying
     * any four adjacent locations. This can be in any direction (left, right, up, down, diagonally)
     *
     * @param x - the X location
     * @param y - the Y location
     * @return - the largest product that can be made from this location.
     */
    private int largestProductFromLocation(int x, int y) {
        var totals = new ArrayList<Integer>();

        if (x >= 3) {
            totals.add(productInDirection(x, y, -1, 0));
        }

        if (x <= PRODUCT_GRID.length - 4) {
            totals.add(productInDirection(x, y, 1, 0));
        }

        if (y >= 3) {
            totals.add(productInDirection(x, y, 0, -1));
        }

        if (y <= PRODUCT_GRID.length - 4) {
            totals.add(productInDirection(x, y, 0, 1));
        }

        if (x <= PRODUCT_GRID.length - 4 && y <= PRODUCT_GRID.length - 4) {
            totals.add(productInDirection(x, y, 1, 1));
        }

        if (x >= 3 && y <= PRODUCT_GRID.length - 4) {
            totals.add(productInDirection(x, y, -1, 1));
        }

        return Collections.max(totals);
    }

    /**
     * From a given starting location in the grid and a given X and Y directional increase/decrease,
     * calculate the product of multiplying the next four locations following those directions.
     *
     * @param startX - the starting X location
     * @param startY - the starting Y location
     * @param directionX - the direction on the X axis
     * @param directionY - the direction on the Y axis
     * @return - the product of multiplying the four locations.
     */
    private int productInDirection(int startX, int startY, int directionX, int directionY) {
        var total = 1;

        for (int index = 0; index < 4; index++) {
            total *= PRODUCT_GRID[startX + (index * directionX)][startY + (index * directionY)];
        }

        return total;
    }
}
