package org.casa.br.EAD;

import java.util.ArrayList;

public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Numbers in the list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
