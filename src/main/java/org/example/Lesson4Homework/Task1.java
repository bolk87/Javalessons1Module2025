package org.example.Lesson4Homework;

public class Task1 {
    public static void main(String[] args) {
        String[] toDoList = new String[5];
        toDoList[0] = "Позавтракать";
        toDoList[1] = "Пообедать";
        toDoList[2] = "Поужинать";
        toDoList[3] = "Прослушать лекцию";
        toDoList[4] = "Сделать домашнее задание";
        for (int i = 0; i < toDoList.length; i = i + 1) {
            System.out.println(toDoList[i]);
        }
    }
}
