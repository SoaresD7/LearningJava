package WhileJava;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        int i = 0;
        do {
            System.out.print(str.charAt(i) + " ");
            i++;
        } while (i < str.length());

        sc.close();
    }
}
