package org.JavaDavi.br;
import java.util.Arrays;
public class For29 {
        public static void main(String[] args) {
            int[] vetor = {5, 3, 8, 1, 2};

            for (int i = 0; i < vetor.length - 1; i++) {
                int menor = i;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[j] < vetor[menor]) {
                        menor = j;
                    }
                }
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }

            System.out.println(Arrays.toString(vetor));
        }
}
