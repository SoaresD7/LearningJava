package org.casa.br.CreationsOfMethodsPOO.Program;
import org.casa.br.CreationsOfMethodsPOO.Entities.Entities2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities2 checker = new Entities2();

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (checker.isSumGreaterThan100(number1, number2)) {
            System.out.println("The sum is greater than 100");
        } else {
            System.out.println("The sum is not greater than 100");
        }
    }
}