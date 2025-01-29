package org.casa.br;

import java.util.Scanner;

public class CategoriesAndClassifications4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter systolic pressure (mmHg): ");
        int systolic = sc.nextInt();

        System.out.print("Enter diastolic pressure (mmHg): ");
        int diastolic = sc.nextInt();

        String riskLevel = assessRiskLevel(systolic, diastolic);

        System.out.println("Risk level based on blood pressure: " + riskLevel);

        sc.close();
    }

    public static String assessRiskLevel(int systolic, int diastolic) {
        if (systolic < 120 && diastolic < 80) {
            System.out.println("Normal");
        } else if ((systolic >= 120 && systolic <= 139) || (diastolic >= 80 && diastolic <= 89)) {
            System.out.println("Moderate");
        } else {
            System.out.println("High");
        }
        return "Invalided";
    }
}
