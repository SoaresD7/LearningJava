package org.casa.br.CreationsOfMethodsPOO.Entities;

public class Entities3 {
    public String getAgeCategory(int age) {
        if (age < 12) {
            return "You are a Kid!";
        } else if (age <= 17) {
            return "You are a Teenager!";
        } else if (age <= 59) {
            return "You are an Adult!";
        } else {
            return "You are an Elderly!";
        }
    }
}
