package org.leet.code.array;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            transpose(mat);
            reflect(mat);
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }
        return false;
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void reflect(int[][] matrix) {
        final int matrixLength = matrix.length;
        final int middle = matrixLength / 2 + matrixLength % 2;

        for (int r = 0; r < matrixLength; r++) {
            for (int lr = 0, rl = matrixLength - 1; lr < middle && rl >= middle; lr++, rl--) {
                final int tmp = matrix[r][lr];
                matrix[r][lr] = matrix[r][rl];
                matrix[r][rl] = tmp;
            }
        }
    }
}