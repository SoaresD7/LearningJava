package WhileJava;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int tabuada = sc.nextInt();
        int multiplicador = 1;

        System.out.println("Tabuada do " + tabuada + ":");
        do {
            System.out.println(tabuada + " x " + multiplicador + " = " + (tabuada * multiplicador));
            multiplicador++;
        } while (multiplicador <= 10);

        sc.close();

    }
}
