package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Доллары в евро");
        System.out.println("2. Евро в доллары");
        System.out.println("3. Метры в футы");
        System.out.println("4. Градусы Цельсия в градусы Фаренгейта");


        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Currency.convertDollarsToEuros(scanner);
            case 2 -> Currency.convertEurosToDollars(scanner);
            case 3 -> Lenght.convertMetersToFeet(scanner);
            case 4 -> Temperature.convertCelsiusToFahrenheit(scanner);
            default -> System.out.println("Неправильный выбор.");
        }

    }
}