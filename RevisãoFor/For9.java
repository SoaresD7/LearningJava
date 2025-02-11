package Exercícios_For;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println("Tabuada do " + num + ": " + num + "x"+ i + "="+ (num * i));
        }

    }
}

