package org.casa.br.EAD;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("Maximum element: " + max);
        sc.close();
    }

}
