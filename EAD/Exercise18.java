package org.casa.br.EAD;

import java.util.Random;

public class Exercise18 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
                sum += matrix[i][j];
            }
        }

        double average = sum / 16.0;

        System.out.println("Generated 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Average of matrix elements: " + average);
    }
}
