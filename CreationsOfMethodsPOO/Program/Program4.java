package org.casa.br.CreationsOfMethodsPOO.Program;

import org.casa.br.CreationsOfMethodsPOO.Entities.Entities4;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities4 balanceChecker = new Entities4();

        System.out.print("Enter your amount: ");
        double balance = sc.nextDouble();

        System.out.println(balanceChecker.checkBalance(balance));
    }
}
