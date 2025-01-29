package org.casa.br;

import java.util.Scanner;

import java.util.Random;

public class ChallengesGames5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(10) + 1;  // Random number between 1 and 10

        System.out.print("Guess the number between 1 and 10: ");
        int userGuess = sc.nextInt();

        if (userGuess == secretNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, the correct number was " + secretNumber + ".");
        }
    }
}
