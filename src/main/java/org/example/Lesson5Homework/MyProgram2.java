package org.example.Lesson5Homework;

public class MyProgram2 {
    public static void main(String[] args) {
        // Создаем новый экземпляр класса Car
        Car car = new Car("Porsche", "911");

        // Запрашиваем текущую скорость и выводим (должно быть 0)
        int speed = car.getCurrentSpeed();
        System.out.println(speed); // 0

        // Увеличиваем скорость на 25
        car.speedUp(25);
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 25

        // Тормозим
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 15

        // Тормозим еще раз
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 5

        // Тормозим последний раз
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 0
    }
}
