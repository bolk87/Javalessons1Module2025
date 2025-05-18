package org.example.Lesson5Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int checkNumber = new Scanner(System.in).nextInt();
        if (checkNumber % 2 == 0) {
            System.out.println("Четное число.");
        } else {
            System.out.println("Нечетное число.");
        }
    }
}
