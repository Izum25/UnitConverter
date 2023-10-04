package Converter;

import java.util.Scanner;

public class Temperature {
    public static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        // Формула для конвертации градусов Цельсия в градусы Фаренгейта
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Результат: " + fahrenheit + " градусов Фаренгейта");
    }
}
