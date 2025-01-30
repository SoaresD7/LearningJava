package org.casa.br;

import java.util.Scanner;

public class ChallengesGames4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int[] numbers = {num1, num2, num3};
        java.util.Arrays.sort(numbers);

        System.out.println("The numbers in ascending order are: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
