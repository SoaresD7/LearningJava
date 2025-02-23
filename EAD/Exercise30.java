package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.set(i, 0);
            }
        }

        System.out.println("List after replacing negatives with zero: " + numbers);
        sc.close();
    }
}
