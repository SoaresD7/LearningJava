package org.casa.br.EAD;

import java.util.Scanner;
import java.util.ArrayList;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("Enter a number to check: ");
        int checkNum = sc.nextInt();

        if (numbers.contains(checkNum)) {
            System.out.println("The number is in the list.");
        } else {
            System.out.println("The number is not in the list.");
        }

        sc.close();
    }
}
