package com.github.pkg.questions;

import com.github.pkg.solution.Solution;

public class Question15 extends Solution<Long> {
    private static final int END_X = 21;
    private static final int END_Y = 21;
    private static final long[][] GRID;

    static {
        GRID = new long[END_X][END_Y];
        for (int x = 0; x < END_X; x++) {
            for (int y = 0; y < END_Y; y++) {
                GRID[x][y] = -1;
            }
        }
    }

    @Override
    public Long solve() {
        return solvePath(0, 0);
    }

    @Override
    public void test() {
    }

    private long solvePath(int x, int y) {
        // Out of bounds
        if (x < 0 || x >= END_X || y < 0 || y >= END_Y) {
            return 0;
        }

        // At the end
        if (x == END_X - 1 && y == END_Y - 1) {
            return 1;
        }

        // Already seen how many steps are needed from this position, do not recalculate
        if (GRID[x][y] != -1) {
            return GRID[x][y];
        }

        // Recursively calculate solution, storing in cache once known
        var next = solvePath(x + 1, y) + solvePath(x, y + 1);
        GRID[x][y] = next;

        return next;
    }

}
