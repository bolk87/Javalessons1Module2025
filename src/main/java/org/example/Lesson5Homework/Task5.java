package org.example.Lesson5Homework;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i = i + 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
