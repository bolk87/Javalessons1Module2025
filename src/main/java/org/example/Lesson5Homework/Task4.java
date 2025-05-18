package org.example.Lesson5Homework;

public class Task4 {
    public static void main(String[] args) {
        String password = "StrongP@ss1";

        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
            return;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            return;
        }

        if (!password.matches(".*[!@#$%^&*№].*")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            return;
        }

        System.out.println("Пароль принят");
    }
}
