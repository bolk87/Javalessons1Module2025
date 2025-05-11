package org.example.Lesson4Homework;

public class Task2 {
    public static void main(String[] args) {
        float[] numbers = new float[3];
        numbers[0] = 3.14159f;
        numbers[1] = 2.71828f;
        numbers[2] = 1f;
        for (int i = 0; i < numbers.length; i = i + 1) {
            System.out.println(numbers[i]);
        }
    }
}
