package WhileJava;

import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver seus divisores: ");
       int num = sc.nextInt();
      int  i = 1;
        do {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= num);

        sc.close();
    }
}
