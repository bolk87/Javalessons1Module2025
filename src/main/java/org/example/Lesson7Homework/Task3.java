package org.example.Lesson7Homework;

//● создайте класс Movie (можно использовать тот, что создавали ранее)
//● в классе создайте поля:
//○ название
//○ рейтинг (от 0 до 10)
//○ жанр
//○ страна
//○ есть ли оскар (да/нет)
//● создайте в другом классе метод psvm.
//● в этом методе объявите список films
//● положите в список 3 любимых фильма
//● выведите на экран информацию о фильме по индексу 1

import org.example.Lesson4Homework.Movie;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Movie> films = new HashMap<>();
        Movie film1 = new Movie("Москва слезам не верит", 10, "драма",
                "СССР", true, 1979);
        Movie film2 = new Movie("Интерстелар", 10, "фантастика",
                "США", false, 2014);
        Movie film3 = new Movie("Ла-ла Ленд", 10, "мюзикл",
                "США", true, 2017);

        films.put(1, film1);
        films.put(2, film2);
        films.put(3, film3);

        System.out.println(films.get(1));
    }
}
