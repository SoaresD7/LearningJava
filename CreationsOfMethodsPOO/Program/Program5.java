package org.casa.br.CreationsOfMethodsPOO.Program;

import org.casa.br.CreationsOfMethodsPOO.Entities.Entities5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities5 entities = new Entities5();

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println(entities.checkNumbersSign(num1, num2));
    }
}
