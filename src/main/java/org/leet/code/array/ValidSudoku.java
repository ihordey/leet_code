package org.leet.code.array;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudokuArray(char[][] board) {
        final int size = 9;
        final int step = 3;

        final int[][] rows = new int[size][size];
        final int[][] columns = new int[size][size];
        final int[][] boards = new int[size][size];

        for (int r = 0; r < size; r++) {
            rows[r] = new int[size];
            columns[r] = new int[size];
            boards[r] = new int[size];
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                final int cellDataIndex = board[r][c] - '1';
                // rows
                if (rows[r][cellDataIndex] == 1) {
                    return false;
                }
                rows[r][cellDataIndex] = 1;

                //columns
                if (columns[c][cellDataIndex] == 1) {
                    return false;
                }
                columns[c][cellDataIndex] = 1;

                // boards
                int boardIndex = r / step * 3 + c / step;
                if (boards[boardIndex][cellDataIndex] == 1) {
                    return false;
                }
                boards[boardIndex][cellDataIndex] = 1;
            }
        }
        return true;
    }

    public boolean isValidSudokuSet(char[][] board) {
        final int size = 9;
        final int step = 3;

        final HashSet<Character>[] rows = new HashSet[size];
        final HashSet<Character>[] columns = new HashSet[size];
        final HashSet<Character>[] boards = new HashSet[size];

        for (int r = 0; r < size; r++) {
            rows[r] = new HashSet<>(size);
            columns[r] = new HashSet<>(size);
            boards[r] = new HashSet<>(size);
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                final char cellData = board[r][c];
                if (cellData == '.') {
                    continue;
                }
                // rows
                if (rows[r].contains(cellData)) {
                    return false;
                }
                rows[r].add(cellData);

                //columns
                if (columns[c].contains(cellData)) {
                    return false;
                }
                columns[c].add(cellData);

                // boards
                int boardIndex = r / step * 3 + c / step;
                if (boards[boardIndex].contains(cellData)) {
                    return false;
                }
                boards[boardIndex].add(cellData);
            }
        }
        return true;
    }
}
