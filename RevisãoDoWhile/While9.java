package WhileJava;

import java.util.Scanner;

public class While9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Digite um número (negativo para sair): ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Número positivo: " + num);
            }
        } while (num >= 0);

        sc.close();
    }
}
