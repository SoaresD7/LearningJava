package org.JavaDavi.br;

public class DoWhile51 {
    public static void main(String[] args) {
        int contador = 1;
        int numero = 1;

        do {
            int somaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }
            if (somaDivisores == numero) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador <= 10);
    }
}
