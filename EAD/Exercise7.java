package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);

        System.out.println("Sorted numbers: " + numbers);
        sc.close();
    }
}
