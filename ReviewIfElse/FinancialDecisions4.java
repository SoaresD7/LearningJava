package org.casa.br;

import java.util.Scanner;

public class FinancialDecisions4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter value of the installments");
        double installments = sc.nextDouble();

        if (installments >= salary * 0.10) {
            System.out.println("You can pay for the product in installments!");
        } else {
            System.out.println("You can not pay for the product in installments!");
        }
        sc.close();
    }
}