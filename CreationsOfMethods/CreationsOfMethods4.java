package org.JavaDavi1402;

import java.util.Scanner;

public class CreationsOfMethods4 {

    public static void main(String[] args) {
        double balance = getBalance();
        checkBalance(balance);
    }

    // Este método solicita que o usuário insira seu saldo
    public static double getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        return sc.nextDouble();
    }

    // Este método vai verificar o saldo e mostrar se o usuário poderá ou não fazer uma retirada
    public static void checkBalance(double balance) {
        if (balance <= 0) {
            System.out.println("You don't have enough money");
        } else {
            System.out.println("You can make a withdrawal");
        }
    }
}
