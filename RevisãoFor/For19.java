package org.JavaDavi.br;
import java.util.Scanner;
public class For19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);
        sc.close();
    }
}
