package org.JavaDavi.br;

public class DoWhile52 {
        public static void main(String[] args) {
            int contador = 0;
            int numero = 2;

            do {
                boolean primo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println(numero);
                    contador++;
                }
                numero++;
            } while (contador < 10);
        }
}
