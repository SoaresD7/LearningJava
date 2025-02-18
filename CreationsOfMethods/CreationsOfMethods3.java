package org.JavaDavi1402;

import java.util.Scanner;

public class CreationsOfMethods3 {
    public static void main(String[] args) {
        int age = getAge();
        printAgeCategory(age);
    }

    // Neste método o usuário irá inserir a idade
    public static int getAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        return sc.nextInt();  // Retorna a idade inserida
    }

    // Neste método irá mostrar de acordo com a idade inserida, sua faixa etária
    public static void printAgeCategory(int age) {
        if (age < 12) {
            System.out.println("You are a Kid!");
        } else if (age <= 17) {
            System.out.println("You are a Teenager!");
        } else if (age <= 59) {
            System.out.println("You are an Adult!");
        } else {
            System.out.println("You are an Elderly!");
        }
    }
}
