package org.example;
//Clase principal del programa.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad a convertir:");
        double amount = scanner.nextDouble();

        System.out.println("Seleccione la moneda de origen:");
        Currency from = selectCurrency(scanner);

        System.out.println("Seleccione la moneda de destino:");
        Currency to = selectCurrency(scanner);

        double convertedAmount = CurrencyConverter.convert(amount, from, to);
        System.out.printf("%.2f %s es igual a %.2f %s%n", amount, from, convertedAmount, to);
    }

    private static Currency selectCurrency(Scanner scanner) {
        Currency[] currencies = Currency.values();
        for (int i = 0; i < currencies.length; i++) {
            System.out.printf("%d. %s (%s)%n", i + 1, currencies[i].getDisplayName(), currencies[i]);
        }
        int choice = scanner.nextInt();
        return currencies[choice - 1];
    }
}
