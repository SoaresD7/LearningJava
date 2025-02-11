package org.JavaDavi.br;
import java.util.Scanner;
public class DoWhile50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "senha123";
        String senhaInformada;

        do {
            System.out.print("Digite a senha: ");
            senhaInformada = scanner.nextLine();
        } while (!senhaInformada.equals(senhaCorreta));

        System.out.println("Senha correta!");
    }
}
