package WhileJava;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        double soma = 0;



        do{
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            soma +=  num;
        }while(num > 0);



        System.out.println("Resultado da soma :" + soma);

        sc.close();
    }

}
