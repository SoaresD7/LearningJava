package org.Laboratorio.br;

import java.util.Scanner;

public class MathPow13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = -0.5;
        double absoluteValue = Math.abs(number);

        System.out.println("The absolute value of " + number + " is: " + absoluteValue);

        sc.close();
    }
}
