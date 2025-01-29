package org.casa.br;
import java.util.Scanner;
public class HourDate4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time (HH:mm): ");
        String time = sc.nextLine();

        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);

        if (hours >= 6 && hours < 12) {
            System.out.println("Morning");
        } else if (hours >= 12 && hours < 18) {
            System.out.println("Afternoon");
        } else if (hours >= 18 && hours < 24) {
            System.out.println("Night");
        } else {
            System.out.println("Invalid time.");
        }
    }
}
