package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < 7; i++) {
            numbers.add(sc.nextInt());
        }

        Collections.reverse(numbers);

        System.out.println("Reversed list: " + numbers);
        sc.close();
    }
}
