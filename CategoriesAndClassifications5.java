package org.casa.br;

import java.util.Scanner;

public class CategoriesAndClassifications5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        int Temperature = sc.nextInt();

        if (Temperature <= 20) {
            System.out.println("The temperature is Cold!");
        }
        else if (Temperature <= 26) {
            System.out.println("The temperature is pleasant!");
        }
        else {
            System.out.println("The temperature is Hot!");
        }
    }
}
