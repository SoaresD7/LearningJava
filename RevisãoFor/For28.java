package org.JavaDavi.br;
public class For28 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        double media = (double) soma / vetor.length;
        System.out.println("Média: " + media);
    }
}
