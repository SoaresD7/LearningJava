package org.JavaDavi.br;
import java.util.Scanner;
public class For16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        for (char c : texto.toCharArray()) {
            System.out.println(c);
        }

        sc.close();
    }
}
