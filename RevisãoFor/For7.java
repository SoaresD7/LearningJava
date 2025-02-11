package Exercícios_For;

public class For7 {
    public static void main(String[] args) {
        double soma = 0;
        for (int i = 1; 1 <= 100; i++ ) {
            System.out.println(i);

            if (i % 2 != 0) {

                soma += i;


            }
            System.out.println("A soma dos números é:" + soma);
        }
    }

}