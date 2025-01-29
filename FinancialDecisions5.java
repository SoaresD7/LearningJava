package org.casa.br;

import java.util.Scanner;

public class FinancialDecisions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the total value of your purchase? ");
        double Total = sc.nextDouble();
        double Gift = 0;

        if (Total < 500) {
            Gift = 0;
            System.out.println("Your purchase is not entitled to a free gift");
        }
        else {
            System.out.println("Your purchase is entitled to a free gift");
        }
        sc.close();
    }
}
