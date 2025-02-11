package WhileJava;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int soma = 0;
        do{
            soma += num;
            num++;

        }while(num <= 50);

        System.out.println("Resultado da soma: " + soma);
        sc.close();
    }
}
