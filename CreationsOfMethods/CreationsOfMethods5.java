package org.JavaDavi1402;

import java.util.Scanner;

public class CreationsOfMethods5 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        int num1 = numbers[0];
        int num2 = numbers[1];

        checkNumbersSign(num1, num2);
    }

    // Este méto solicita a entrada de dois número que serão inseridos pelo usuário
    public static int[] getNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter the first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter the second number: ");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    // Este método verifica os dois números digitados pelo usuário e verifica se são positivos ou negativos
    public static void checkNumbersSign(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Both numbers are negative.");
        } else {
            System.out.println("One number is positive and the other is negative.");
        }
    }
}
