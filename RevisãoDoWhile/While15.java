package WhileJava;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor máximo para a sequência de Fibonacci: ");
        int max = sc.nextInt();
        int a = 0, b = 1, next;
        do {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        } while (a <= max);
        System.out.println();

        sc.close();
    }
}

