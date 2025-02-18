package org.JavaDavi1402;

import java.util.Scanner;

public class CreationsOfMethods2 {
    public static void main(String[] args) {
        int number1 = getNumber("Enter the first number: ");
        int number2 = getNumber("Enter the second number: ");
        checkSumGreaterThan100(number1, number2);
    }

    // Neste método o usuário irá inserir os dois números solicitados
    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();  // Retorna o número inserido
    }

    // Neste método o programa irá verificar se a soma dos dois número é maior ou menor que 100
    public static void checkSumGreaterThan100(int number1, int number2) {
        if (number1 + number2 > 100) {
            System.out.println("The sum is greater than 100");
        } else {
            System.out.println("The sum is not greater than 100");
        }
    }
}
