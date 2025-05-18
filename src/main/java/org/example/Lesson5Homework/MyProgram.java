package org.example.Lesson5Homework;

public class MyProgram {
    public static void main(String[] args) {

        Card myCard = new Card("9111111111111111", "12/26", "123", "0205");

        // Вызываем метод печати с маской
        myCard.printMaskedCardNumber(); // Выведет: **** **** **** 1111

        // Вызываем метод печати с пин-кодом (сначала неверный, потом верный)
        myCard.printFullCardNumber("1234"); // Выведет: "Неверный пин-код"
        myCard.printFullCardNumber("0205"); // Выведет полный номер карты

        // Попытка доступа к полям напрямую (вызовет ошибку компиляции)
        // System.out.println(myCard.cardNumber); // Ошибка: cardNumber has private access in Card
        // System.out.println(myCard.pinCode);   // Ошибка: pinCode has private access in Card
    }
}
