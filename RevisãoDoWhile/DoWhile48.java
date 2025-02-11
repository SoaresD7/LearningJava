package org.JavaDavi.br;
import java.util.Scanner;
public class DoWhile48 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Informe um número (digite 0 para sair): ");
                numero = scanner.nextInt();

                if (numero != 0) {
                    if (numero % 2 == 0) {
                        System.out.println("O número " + numero + " é par.");
                    } else {
                        System.out.println("O número " + numero + " é ímpar.");
                    }
                }
            } while (numero != 0);
        }
}
