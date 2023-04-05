package org.example;
//Clase que contiene la lógica principal del convertidor de monedas.

public class CurrencyConverter {

    public static double convert(double amount, Currency from, Currency to) {
        double conversionRate = ConversionRate.getRate(from, to);
        return amount * conversionRate;
    }
}
