package org.example.Lesson5Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt(); // Можно присвоить любое значение

        if (number % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (number % 2 == 0) {
            System.out.println("Четное число.");
        } else if (number % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}
