package org.Laboratorio.br;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathSrqt9 {
    public static void main(String[] args) {
        double number = 10;
        double squareRoot = Math.sqrt(number);


        BigDecimal roundedSquareRoot = new BigDecimal(squareRoot).setScale(1, RoundingMode.HALF_UP);

        System.out.println("The SquareRoot of " + number + " is: " + squareRoot);
    }
}
