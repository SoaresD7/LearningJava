package org.casa.br;

import java.util.Scanner;
public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (word.length() > 5) {
            System.out.println("The word \"" + word + "\" has more than 5 characters.");
        } else {
            System.out.println("The word \"" + word + "\" has 5 or fewer characters.");
        }

        sc.close();
    }
}
