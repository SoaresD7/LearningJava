package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }

        Collections.sort(names);

        System.out.println("Sorted names: " + names);
        sc.close();
    }
}
