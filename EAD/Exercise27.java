package org.casa.br.EAD;

import java.util.Random;

public class Exercise27 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }

        System.out.println("Sum of all matrix elements: " + sum);
    }
}
