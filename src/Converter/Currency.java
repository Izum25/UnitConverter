package Converter;

import java.util.Scanner;

public class Currency {
    public static void convertDollarsToEuros(Scanner scanner) {
        System.out.println("Введите сумму в долларах: ");
        double dollars = scanner.nextDouble();

        // Коэффициент конвертации долларов в евро (примерный)
        double conversionRate = 0.85;

        double euros = dollars * conversionRate;
        System.out.println("Результат: " + euros + " EUR");
    }

    public static void convertEurosToDollars(Scanner scanner) {
        System.out.println("Введите сумму в евро: ");
        double euros = scanner.nextDouble();

        // Коэффициент конвертации евро в доллары (примерный)
        double conversionRate = 1.04 ;

        double dollars = euros * conversionRate;
        System.out.println("Результат: " + dollars + " USD");
    }
}
