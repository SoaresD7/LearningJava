package org.JavaDavi.br;
import java.util.Scanner;
public class For17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();
        System.out.println("Invertida: " + invertida);

        sc.close();
    }
}
