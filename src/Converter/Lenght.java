package Converter;

import java.util.Scanner;

public class Lenght {
    public static void convertMetersToFeet(Scanner scanner) {
        System.out.print("Введите длину в метрах: ");
        double meters = scanner.nextDouble();

        // 1 метр = 3.28084 фута
        double feet = meters * 3.28084;
        System.out.println("Результат: " + feet + " футов");
    }
}
