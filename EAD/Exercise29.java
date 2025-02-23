package org.casa.br.EAD;

import java.util.Random;

public class Exercise29 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        int[] colSum = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int[] row : matrix) {
                colSum[j] += row[j];
            }
        }

        System.out.println("Sum of each column:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Column " + (i + 1) + ": " + colSum[i]);
        }
    }
}
