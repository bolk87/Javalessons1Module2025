package org.example.Lesson3Homework;

// Задание 1
public class CardNumber {
    public static void main(String[] args) {
        String cardNumber1 = "1234 5678 9012 3456";
        String cardNumber2 = "1234567890123456";
        String cardNumber3 = "12345678901";

        System.out.println(maskCardNumber(cardNumber1)); // **** **** **** 3456
        System.out.println(maskCardNumber(cardNumber2)); // ************3456
        System.out.println(maskCardNumber(cardNumber3)); // Некорректный номер карты
    }

    public static String maskCardNumber(String cardNumber) {
        // Удаляем все пробелы из номера карты
        String digitsOnly = cardNumber.replaceAll("\\s+", "");

        // Проверяем, что номер карты состоит только из цифр и имеет длину 16 символов
        if (!digitsOnly.matches("\\d{16}")) {
            return "Некорректный номер карты";
        }

        // Получаем последние 4 цифры
        String lastFour = digitsOnly.substring(digitsOnly.length() - 4);

        // Форматируем с пробелами, если исходная строка содержала пробелы
        if (cardNumber.contains(" ")) {
            return "**** **** **** " + lastFour;
        } else {
            return "************" + lastFour;
        }
    }
}
