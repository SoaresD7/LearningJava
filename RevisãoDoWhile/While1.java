package WhileJava;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número (número negativo para sair): ");
            num = sc.nextInt();
        } while (num >= 0);

        sc.close();
    }
}
