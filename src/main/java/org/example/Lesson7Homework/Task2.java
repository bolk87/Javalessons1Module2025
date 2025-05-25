package org.example.Lesson7Homework;
//Создайте список строк (List)
//● Положите в список 5 дел на день
//● в цикле выведите список в формате:
//        ○ Задача 1: {текст задачи}
//        ○ Задача 2: {текст задачи}
//        ○ ...
//        ○ Задача 5: {текст задачи}

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Проснуться");
        toDoList.add("Позавтракать");
        toDoList.add("Поработать");
        toDoList.add("Поужинать");
        toDoList.add("Сделать домашнюю работу");

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + toDoList.get(i));
        }
    }
}
