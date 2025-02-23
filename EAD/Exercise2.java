package org.casa.br.EAD;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            numbers.add(num);
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
        sc.close();
    }
}
