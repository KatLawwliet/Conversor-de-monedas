package org.example;

//Clase que contiene las tasas de conversión entre las monedas.Clase que contiene las tasas de conversión entre las monedas.

public class ConversionRate {

    private static final double[][] conversionRates = {
            // USD EUR JPY GBP ARS MXN
            /* USD */ { 1.0, 0.85, 110.0, 0.75, 97.57, 20.16 },
            /* EUR */ { 1.176, 1.0, 129.32, 0.882, 114.55, 23.72 },
            /* JPY */ { 0.00909, 0.00773, 1.0, 0.00682, 0.886, 0.183 },
            /* GBP */ { 1.333, 1.134, 146.49, 1.0, 130.10, 26.87 },
            /* ARS */ { 0.01025, 0.00873, 1.129, 0.00768, 1.0, 0.204 },
            /* MXN */ { 0.0496, 0.0422, 5.46, 0.0373, 4.9, 1.0 }
    };

    public static double getRate(Currency from, Currency to) {
        return conversionRates[from.ordinal()][to.ordinal()];
    }
}
