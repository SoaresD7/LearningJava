package org.casa.br.CreationsOfMethodsPOO.Program;

import org.casa.br.CreationsOfMethodsPOO.Entities.Entities1;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities1 access = new Entities1();

        System.out.print("Enter the access code: ");
        int enteredCode = sc.nextInt();

        if (access.checkAccess(enteredCode)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
