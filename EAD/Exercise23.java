package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.print("Enter a multiplier: ");
        int multiplier = sc.nextInt();

        System.out.println("Numbers after multiplication:");
        for (int num : numbers) {
            System.out.println(num * multiplier);
        }
        sc.close();
    }
}
