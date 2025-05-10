package org.example.Lesson3Homework;

public class Room {
    double square; // площадь
    boolean isForRent; //комната для сдачи
    boolean isHaveBath; // имеет ли комната свой санузел
    String repair; //ремонт
    String furniture; //мебель
    String info; //дополнительная информация

    public Room(double square, boolean isForRent, boolean isHaveBath, String repair, String furniture, String info) {
        this.square = square;
        this.isForRent = isForRent;
        this.isHaveBath = isHaveBath;
        this.repair = repair;
        this.furniture = furniture;
        this.info = info;
    }
}
