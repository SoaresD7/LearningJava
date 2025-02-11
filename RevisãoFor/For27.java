package org.JavaDavi.br;
import java.util.Scanner;
public class For27 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] vetor = {1, 2, 3, 4, 5};

            int soma = 0;
            for (int num : vetor) {
                soma += num;
            }

            System.out.println("Soma: " + soma);
            sc.close();
        }
}
