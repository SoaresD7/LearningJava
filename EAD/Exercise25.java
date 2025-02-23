package org.casa.br.EAD;

import java.util.ArrayList;

public class Exercise25 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Davi");
        names.add("Miguel");
        names.add("Anna");
        names.add("Maria");
        names.add("Arthur");

        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}
