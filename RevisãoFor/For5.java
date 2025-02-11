package Exercícios_For;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for(int i = 1; 1<=100;i++){
            System.out.println(i);

            soma = soma + i;

            System.out.println("A soma dos números é:" + soma );
        }
    }
}
