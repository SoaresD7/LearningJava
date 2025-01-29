package org.casa.br;

import java.util.Scanner;

public class AvgNote5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the note of the student in the portuguese: ");
        int note1 = sc.nextInt();

        System.out.println("Enter the note of the student in the math: ");
        int note2 = sc.nextInt();

        if (note1 >= 6 && note2 >= 6) {
            System.out.println("The student achieved an average in both subjects");

        } else {
            System.out.println("The student did not obtain an average in both subjects");
        }

    }
}
