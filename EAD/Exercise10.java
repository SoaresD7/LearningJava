package org.casa.br.EAD;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> mergedList = new ArrayList<>();

        System.out.println("Enter 5 numbers for the first list:");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

        System.out.println("Enter 5 numbers for the second list:");
        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Merged list: " + mergedList);
        sc.close();
    }
}
