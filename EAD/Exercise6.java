package org.casa.br.EAD;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println("List without odd numbers: " + numbers);
    }
}
