package org.JavaDavi.br;

public class DoWhile53 {
    public static void main(String[] args) {
        int termo = 1;
        int soma = 0;

        do {
            soma += termo;
            System.out.println(soma);
            termo++;
        } while (termo <= 10);
    }
}
