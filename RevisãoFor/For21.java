package org.JavaDavi.br;
import java.util.Scanner;
public class For21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int soma = 0;
        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);
        sc.close();
    }
}
