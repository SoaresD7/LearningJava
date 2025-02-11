package WhileJava;

import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = sc.nextLine();

        int i = input.length() - 1;
        System.out.print("String invertida: ");


        do {
            System.out.print(input.charAt(i));
            i--;
        } while (i >= 0);

        System.out.println();
        sc.close();
    }
}
