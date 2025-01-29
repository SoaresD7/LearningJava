package org.casa.br;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = sc.nextLine();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are equal.");
        } else {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are not equal.");
        }

        sc.close();
    }
}
