package WhileJava;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        System.out.println("Números de 1 a 10:");
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        sc.close();
    }
}
