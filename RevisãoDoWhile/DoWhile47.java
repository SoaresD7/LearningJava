package org.JavaDavi.br;
import java.util.Scanner;
public class DoWhile47 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            int divisor = 2;
            boolean primo = true;

            do {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            } while (divisor <= Math.sqrt(numero));

            if (primo && numero > 1) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }
}
