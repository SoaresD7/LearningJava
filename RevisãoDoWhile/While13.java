package WhileJava;

import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Digite um número para somar os dígitos: ");
        num = sc.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Soma dos dígitos: " + sum);

        sc.close();
    }
}
