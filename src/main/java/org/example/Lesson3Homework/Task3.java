package org.example.Lesson3Homework;

public class Task3 {
    public static void main(String[] args) {
        // Создание объектов с разными параметрами
        Item item1 = new Item("Смартфон", "SM123", 4,7, "красный");
        Item item2 = new Item("Ноутбук", "NB456", 999.99, 12, "белый");
        Item item3 = new Item("Наушники", "HP789", 5, 3, "серый");
        Item item4 = new Item("Планшет", "TB012", 299.99, 10, "малиновый");
        Item item5 = new Item("Часы", "TV099", 799.99, 19, "фиолетовый");

        System.out.println("Артикул - "+item1.article+" Название - "+item1.name+
                " Цена - "+item1.price+" Количество - "+item1.quantity+
                " Цвет - "+item1.color);
        System.out.println("Артикул - "+item2.article+" Название - "+item2.name+
                " Цена - "+item2.price+" Количество - "+item2.quantity+
                " Цвет - "+item2.color);
        System.out.println("Артикул - "+item3.article+" Название - "+item3.name+
                " Цена - "+item3.price+" Количество - "+item3.quantity+
                " Цвет - "+item3.color);
        System.out.println("Артикул - "+item4.article+" Название - "+item4.name+
                " Цена - "+item4.price+" Количество - "+item4.quantity+
                " Цвет - "+item4.color);
        System.out.println("Артикул - "+item5.article+" Название - "+item5.name+
                " Цена - "+item5.price+" Количество - "+item5.quantity+
                " Цвет - "+item5.color);
    }
}
