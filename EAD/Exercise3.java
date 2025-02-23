package org.casa.br.EAD;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            numbers.add(num);
            sum += num;
        }

        double average = sum / 6.0;
        System.out.println("Average: " + average);
        sc.close();
    }
}
