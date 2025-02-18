package org.casa.br.CreationsOfMethodsPOO.Program;
import java.util.Scanner;
import org.casa.br.CreationsOfMethodsPOO.Entities.Entities3;

    public class Program3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Entities3 ageChecker = new Entities3();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println(ageChecker.getAgeCategory(age));
        }
}
