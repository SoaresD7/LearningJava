package org.casa.br.EAD;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers.add(sc.nextInt());
        }

        System.out.println("Numbers entered: " + numbers);
        sc.close();
    }
}
