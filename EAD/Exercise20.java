package org.casa.br.EAD;

import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }

        System.out.println("Generated Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
            System.out.println("Sum of column " + (i + 1) + ": " + colSum);
        }
    }
}
