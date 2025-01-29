package org.casa.br;

import java.util.Scanner;

public class EverydaySituations5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "user123";  // Example username
        String correctPassword = "password";  // Example password

        System.out.print("Enter your username: ");
        String enteredUsername = sc.nextLine();
        System.out.print("Enter your password: ");
        String enteredPassword = sc.nextLine();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
