package WhileJava;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int num;
        do {
            System.out.print("Digite um número (0 para parar): ");
            num = sc.nextInt();
            if (num != 0) cont++;
        } while (num != 0);
        System.out.println("Total de números digitados: " + cont);

        sc.close();
    }
}
