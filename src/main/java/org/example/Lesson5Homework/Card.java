package org.example.Lesson5Homework;

public class Card {
    private String cardNumber; //номер карты
    private String expirationDate; //срок годности карты
    private String cvv; //номер CVV
    private String pinCode; //пин-код карты


    public Card(String cardNumber, String expirationDate, String cvv, String pinCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    // Метод для печати номера карты с маскировкой
    public void printMaskedCardNumber() {
        if (cardNumber == null || cardNumber.length() < 4) {
            System.out.println("Некорректный номер карты");
            return;
        }

        String lastFourDigits = cardNumber.substring(cardNumber.length() - 4);
        String masked = "**** **** **** " + lastFourDigits;
        System.out.println(masked);
    }

    public void printFullCardNumber(String inputPin) {
        if (pinCode.equals(inputPin)) {
            System.out.println("Номер карты: " + cardNumber);
        } else {
            System.out.println("Неверный пин-код");
        }
    }
}
