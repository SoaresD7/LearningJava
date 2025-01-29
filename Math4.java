package org.casa.br;

import java.util.Scanner;

public class Math4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                System.out.print("Enter the first side: ");
                double a = sc.nextDouble();

                System.out.print("Enter the second side: ");
                double b = sc.nextDouble();

                System.out.print("Enter the third side: ");
                double c = sc.nextDouble();

                if (a + b > c && a + c > b && b + c > a) {
                    System.out.println("These sides can form a triangle.");
                } else {
                    System.out.println("These sides cannot form a triangle.");
                }

                sc.close();
            }
    }
