package org.JavaDavi1402;

import java.util.Scanner;

public class CreationOfMethods1 {

    public static void main(String[] args) {

        // Criação da senha padrão
        int correctCode = 1234;
        int enteredCode = getEnteredCode();

        if (checkAccess(enteredCode, correctCode)) {  // Verifica o código para dar o acesso ou não
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }

    // Neste método o programa solicita que o usuário insira o código configurado
    public static int getEnteredCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the access code: ");
        return sc.nextInt();
    }

    // Neste método o programa confere o último bloco e vê se o que o usuário inseriu é correto
    public static boolean checkAccess(int enteredCode, int correctCode) {
        return enteredCode == correctCode;
    }
}
