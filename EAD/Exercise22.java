package org.casa.br.EAD;

import java.util.ArrayList;

public class Exercise22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
