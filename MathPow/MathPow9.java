package org.Laboratorio.br;

import java.util.Scanner;

public class MathPow9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = -999;
        int absoluteValue = Math.abs(number);

        System.out.println("The absolute value of " + number + " is: " + absoluteValue);

        sc.close();
    }
}
