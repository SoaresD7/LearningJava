package WhileJava;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 10;
        System.out.println("Números de 10 a 1:");
        do {
            System.out.println(contador);
            contador--;
        } while (contador >= 1);

        sc.close();
    }
}
