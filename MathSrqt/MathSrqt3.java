package org.Laboratorio.br;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathSrqt3 {
    public static void main(String[] args) {
        double number = 3;
        double squareRoot = Math.sqrt(number);

        BigDecimal roundedSquareRoot = new BigDecimal(squareRoot).setScale(2, RoundingMode.HALF_UP);

        System.out.println("The SquareRoot of " + number + " is: " + roundedSquareRoot);
    }
}