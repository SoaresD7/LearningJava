package org.casa.br.EAD;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of main diagonal: " + sum);
        sc.close();
    }
}
