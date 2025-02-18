package org.casa.br.CreationsOfMethodsPOO.Entities;

public class Entities4 {
    public String checkBalance(double balance) {
        if (balance <= 0) {
            return "You don't have enough money";
        } else {
            return "You can make a withdrawal";
        }
    }
}
