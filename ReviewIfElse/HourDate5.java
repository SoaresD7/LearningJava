package org.casa.br;

import java.util.Scanner;

import java.time.LocalDate;

public class HourDate5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start date (yyyy-mm-dd): ");
        String startDate = sc.nextLine();
        System.out.print("Enter end date (yyyy-mm-dd): ");
        String endDate = sc.nextLine();
        System.out.print("Enter date to check (yyyy-mm-dd): ");
        String dateToCheck = sc.nextLine();

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        LocalDate date = LocalDate.parse(dateToCheck);

        if (!date.isBefore(start) && !date.isAfter(end)) {
            System.out.println("The date is within the specified range.");
        } else {
            System.out.println("The date is outside the specified range.");
        }
    }
}
