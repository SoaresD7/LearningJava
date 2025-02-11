package WhileJava;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NumImpar = 1;
        System.out.println("Números ímpares de 1 a 20: ");
        do {
            System.out.print(NumImpar + " ");
            NumImpar += 2;
        } while (NumImpar <= 20);


        sc.close();
    }

}
