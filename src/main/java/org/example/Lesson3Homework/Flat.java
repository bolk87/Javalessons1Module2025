package org.example.Lesson3Homework;

public class Flat {
    double square; // площадь
    int countOfRoom; //количество комнат
    String address; //адрес
    String phone; // телефон владельца квартиры
    int floor; //этаж
    boolean isForRent; //квартира для сдачи
    boolean isApartment; // это апартаменты?
    Room room; //объект класса Room

    public Flat(double square, int countOfRoom, String address, String phone, int floor, boolean isForRent,
                boolean isApartment, Room room) {
        this.square = square;
        this.countOfRoom = countOfRoom;
        this.address = address;
        this.phone = phone;
        this.floor = floor;
        this.isForRent = isForRent;
        this.isApartment = isApartment;
        this.room = room;
    }
}
