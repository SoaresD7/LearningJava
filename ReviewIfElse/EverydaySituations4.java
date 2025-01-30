package org.casa.br;
import java.util.Scanner;
public class EverydaySituations4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        if (age >= 18 && age <= 65 && weight >= 50) {
            System.out.println("You are eligible to donate blood.");
        } else {
            System.out.println("You are not eligible to donate blood.");
        }
    }
}
