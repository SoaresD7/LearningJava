package org.casa.br.CreationsOfMethodsPOO.Entities;

public class Entities5 {
    public String checkNumbersSign(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            return "Both numbers are positive.";
        } else if (num1 < 0 && num2 < 0) {
            return "Both numbers are negative.";
        } else {
            return "One number is positive and the other is negative.";
        }
    }
}
