package org.JavaDavi.br;
import java.util.Scanner;
public class For18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        String invertida = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertida)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}
