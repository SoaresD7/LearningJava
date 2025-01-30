package org.Laboratorio.br;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathSrqt17 {
    public static void main(String[] args) {
        double number = 0.001;
        double SquareRoot = Math.sqrt(number);

        BigDecimal roundedSquareRoot = new BigDecimal(SquareRoot).setScale(3, RoundingMode.HALF_UP);

        System.out.println("The SquareRoot of " + number + " is: " + SquareRoot);
    }
}
