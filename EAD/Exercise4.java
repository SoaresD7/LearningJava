package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
    }
}
