package org.casa.br;

import java.util.Scanner;

public class AvgNote4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the note of the student: ");
        int note = sc.nextInt();

        if (note == 10){
            System.out.println("The student got the highest grade");

        }
        else {
            System.out.println("The student did not obtain the highest grade");
        }

    }
}
