package Exercícios_For;

public class For13 {
    public static void main(String[] args) {

        int n = 10; // Número de termos da sequência de Fibonacci
        int a = 0, b = 1;

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");


        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
