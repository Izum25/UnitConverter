package Converter;

import java.util.Scanner;

public class Currency {
    public static void convertDollarsToEuros(Scanner scanner) {
        System.out.println("Введите сумму в долларах: ");
        double dollars = scanner.nextDouble();

        // Коэффициент конвертации долларов в евро (примерный)
        double conversionRate = 0.85;

        double euros = dollars * conversionRate;
        System.out.println("Результат: " + euros + " евро");
    }
}
