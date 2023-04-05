package org.example;
//Enumeración que define las monedas compatibles.

public enum Currency {

    USD("Dólar estadounidense"),
    EUR("Euro"),
    JPY("Yen japonés"),
    GBP("Libra esterlina"),
    ARS("Peso argentino"),
    MXN("Peso mexicano");

    private String displayName;

    Currency(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
