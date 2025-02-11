package WhileJava;

import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPar = 2;
        System.out.println("Números pares de 1 a 20:");
        do {
            System.out.println(numPar);
            numPar += 2;
        } while (numPar <= 20);

        sc.close();
    }
}

