package org.example.Lesson3Homework;

public class Task2 {
    public static void main(String[] args) {
        Flat flatForRent = new Flat(59.1, 2, "г. Москва, пр. Мира, д. 134, кв. 3",
                "89134567722", 4,
                true, false, new Room(14.9, false, true, "евро",
                "мебель для хранения, шкафы", "Красивый вид из окна"));
        System.out.println("Описание квартиры: Площадь: "+flatForRent.square+
                " кв. метров, Количество комнат: "+flatForRent.countOfRoom+
                ", Адрес: "+flatForRent.address+
                ", Телефон: "+flatForRent.phone+
                ", Этаж: "+flatForRent.floor+
                ", Квартира для аренды: "+flatForRent.isForRent+
                ", Это апартаменты: "+flatForRent.isApartment
                +"   Описание комнаты: Площадь: "+flatForRent.room.square+
                ", Комната сдается: "+flatForRent.room.isForRent+
                ", Комната имеет свой санузел: "+flatForRent.room.isHaveBath+
                ", Ремонт: "+flatForRent.room.repair+
                ", Мебель: "+flatForRent.room.furniture+
                ", Дополнительная информация: "+flatForRent.room.info+".");
    }
}
