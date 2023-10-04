package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Доллары в евро");

        int choice = scanner.nextInt();

        switch (choice){
            case 1 -> Currency.convertDollarsToEuros(scanner);
            default -> System.out.println("Неправильный выбор.");
        }

    }



}