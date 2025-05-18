package org.example.Lesson5Homework;

public class Car {
    private String brand;
    private String model;
    private int currentSpeed = 0; // Начальная скорость 0

    // Конструктор класса Car
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Метод для получения текущей скорости
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Метод для увеличения скорости
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    // Метод для торможения (уменьшения скорости)
    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed -= 10;
        }
    }
}
